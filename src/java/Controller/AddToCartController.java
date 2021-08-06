package Controller;

import DAO.BookDAO;
import DTO.BookDTO;
import DTO.CartDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddToCartController extends HttpServlet {

    public static final String SUCCESS = "SearchBookController";
    public static final String ERROR = "errorAddToCart.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String url = ERROR;
        try {
            String bookID = request.getParameter("bookID");
            String bookTitle = request.getParameter("bookTitle");
            float price = Float.parseFloat(request.getParameter("price"));
            String bookImage = request.getParameter("bookImage");
            BookDAO dao = new BookDAO();
            int quantity = dao.getQuantity(bookID);
            if (quantity <= 0) {
                url = SUCCESS;
                request.setAttribute("MSG", "This Book Is Out Of Stock");
            } else {
                BookDTO book = new BookDTO(bookID, bookTitle, bookImage, price, 1);
                HttpSession session = request.getSession();
                CartDTO cart = (CartDTO) session.getAttribute("CART");
                if (cart == null) {
                    cart = new CartDTO();
                }
                cart.add(book);
                session.setAttribute("CART", cart);
                url = SUCCESS;
                request.setAttribute("MSG", "You Selected Book: " + bookTitle + " ADD SUCCESS");
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
