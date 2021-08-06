
package Controller;

import DAO.BookDAO;
import DAO.DiscountDAO;
import DAO.OrderDAO;
import DAO.OrderDetailDAO;
import DAO.UserDAO;
import DTO.BookDTO;
import DTO.CartDTO;
import DTO.OrderDTO;
import DTO.OrderDetailDTO;
import DTO.UserDTO;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckoutController extends HttpServlet {

    public static final String SUCCESS = "checkout.jsp";
    public static final String ERROR = "checkoutError.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            HttpSession session = request.getSession();
            CartDTO cart = (CartDTO) session.getAttribute("CART");
            // Check User Login Or Not
            UserDTO user = (UserDTO) session.getAttribute("USER");

            if (user == null) {
                url = SUCCESS;
                request.setAttribute("MSG", "You Have To Login Before Checkout");
            } else {
                String userID = user.getUserID();
                String discountID = request.getParameter("discountID");
                String discPercent = request.getParameter("discPercent");
                if(discountID == null || discountID == ""){
                    discountID = "none";
                }
                if(discPercent == null || discPercent == ""){
                    discPercent = "1";
                }
                float disc = Float.parseFloat(discPercent);
                float oldWallet = user.getWallet();
                float total = Float.parseFloat(request.getParameter("total"));

                long milis = System.currentTimeMillis();
                Date orderDate = new java.sql.Date(milis);
                UserDAO userDao = new UserDAO();
                BookDAO bookDao = new BookDAO();
                int oldQuantity = 0;
                int newQuantity = 0;
                OrderDAO orderDao = new OrderDAO();
                OrderDetailDAO odDao = new OrderDetailDAO();
                DiscountDAO discDao = new DiscountDAO();

                // INSERT To tblOrders 
                OrderDTO order = new OrderDTO(orderDate, total, discountID, userID);               
                orderDao.insertToOrder(order);
                // INSERT To tblUsers_Discounts
                discDao.insert(discountID, userID);
                // UPDATE User's Wallet
                float newWallet = oldWallet - total;
                userDao.updateWallet(userID, newWallet);

                // Add To OrderDetail And Update Quantity In Store 
                int orderID = orderDao.getOrderID();
                for (BookDTO dto : cart.getCart().values()) {
                    total = 0;
                    total = (dto.getPrice() * dto.getQuantity()) * disc;
                    OrderDetailDTO od = new OrderDetailDTO(dto.getPrice(), dto.getQuantity(), total, orderDate, dto.getBookID(), orderID);
                    // set new quantity in store
                    oldQuantity = bookDao.getQuantity(dto.getBookID());
                    newQuantity = oldQuantity - dto.getQuantity();
                    bookDao.updateQuantity(newQuantity, dto.getBookID());
                    odDao.insertToOrderDetail(od);
                }
                url = SUCCESS;
                request.setAttribute("MSG", "PAY SUCCESSFUL");
                session.setAttribute("CART", null);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
