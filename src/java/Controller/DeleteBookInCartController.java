
package Controller;

import DTO.CartDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DeleteBookInCartController extends HttpServlet {

    public static final String SUCCESS_1 = "SearchBookController";
    public static final String SUCCESS_2 = "bookDetail.jsp";
    public static final String SUCCESS_3 = "checkout.jsp";
    public static final String SUCCESS_4 = "historyPage.jsp";
    
    public static final String ERROR = "errorDeleteBookInCart.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String url = ERROR;
        try {
            String bookID = request.getParameter("bookID");
            String page = request.getParameter("page");
            HttpSession session = request.getSession();
            CartDTO cart = (CartDTO) session.getAttribute("CART");
            if(cart != null){
                cart.deltete(bookID);
                session.setAttribute("CART", cart);
                if(page.equals("shopping")){
                    url = SUCCESS_1;
                } else if(page.equals("bookDetail")){
                    url = SUCCESS_2;
                } else if(page.endsWith("checkout")){
                    url = SUCCESS_3;
                } else if(page.endsWith("history")){
                    url = SUCCESS_4;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
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
