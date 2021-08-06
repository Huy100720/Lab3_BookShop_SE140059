package Controller;

import DAO.DiscountDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckDiscountController extends HttpServlet {

    public static final String SUCCESS = "checkout.jsp";
    public static final String ERROR = "errorCheck.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String url = ERROR;
        try {
            String discountID = request.getParameter("discountID");
            String userID = request.getParameter("userID");
            boolean check_1;
            boolean check_2;
            float Percent;
            if (userID == null) {
                request.setAttribute("MSG", "Please Login First");
                url = SUCCESS;
            } else {
                DiscountDAO dao = new DiscountDAO();
                // check_1 return true if user haven't used this code
                check_1 = dao.checkDiscountUse(userID, discountID);
                // check_2 return true if this code existed
                check_2 = dao.discountExistence(discountID);
                Percent = dao.getDiscountPercent(discountID);
                float discPercent = (100 - Percent)/100;
                if (check_2) {
                    if (check_1) {
                        request.setAttribute("MSG_CHECK", "You Get "+ Percent +"% discount ");
                        request.setAttribute("PERCENT", Percent);
                        request.setAttribute("DISC", discPercent);
                        url = SUCCESS;
                    } else {
                        request.setAttribute("MSG_CHECK", "You Have Use This Code");
                        url = SUCCESS;
                    }
                } else {
                    request.setAttribute("MSG_CHECK", "INVALID CODE");
                    url = SUCCESS;
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
