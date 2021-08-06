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

public class UpdateQuantityController extends HttpServlet {

    private static final String ERROR = "errorUpCart.jsp";
    private static final String SUCCESS = "checkout.jsp";
    private static final String DELETE = "DeleteBookInCartController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String bookID = request.getParameter("bookID");
            String quantity = request.getParameter("quantity");
            BookDAO dao = new BookDAO();
            int qtnInStore = dao.getQuantity(bookID);
            int check;
            if (Integer.parseInt(quantity) < 1) {
                url = DELETE;
            } 
            else {
                if (bookID != null && quantity != null) {
                    check = qtnInStore - Integer.parseInt(quantity);
                    if (check < 0) {
                       url = SUCCESS;
                       request.setAttribute("MSG", "This Quantity Is Out Of Stock");
                    } else {
                        HttpSession sesstion = request.getSession();
                        CartDTO cart = (CartDTO) sesstion.getAttribute("CART");
                        BookDTO book = null;
                        for (BookDTO dto : cart.getCart().values()) {
                            if (dto.getBookID().equals(bookID)) {
                                book = new BookDTO(bookID, dto.getBookTitle(), dto.getBookImage(), dto.getDescription(),
                                        dto.getPrice(), Integer.parseInt(quantity), dto.getAuthor(), dto.getCreateDate(), dto.getCategoryID(), dto.getBookStatus());
                            }
                        }
                        cart.update(bookID, book);
                        sesstion.setAttribute("CART", cart);
                        request.setAttribute("MSG", "Update Success");
                        url = SUCCESS;
                    }
                }
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
