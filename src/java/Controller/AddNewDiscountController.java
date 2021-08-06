package Controller;

import DAO.DiscountDAO;
import DTO.DiscountDTO;
import DTO.DiscountErrorDTO;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNewDiscountController extends HttpServlet {

    public static final String ERROR = "createDiscount.jsp";
    public static final String SUCCESS = "SearchBookController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        DiscountErrorDTO error = new DiscountErrorDTO("", "");
        try {
            String discountID = request.getParameter("discountID");
            String discPtxt = request.getParameter("discPercent");
            long milis = System.currentTimeMillis();
            Date createDate = new java.sql.Date(milis);
            int discPercent = 0;
            boolean check = true;
            if (discountID.length() < 5 || discountID.length() > 30) {
               check = false;
               error.setDiscountIDError("Discount ID Should Have [5 - 30] Character");
            }
            try {
                discPercent = Integer.parseInt(discPtxt);
                if (discPercent <= 0 || discPercent > 100) {
                    check = false;
                    error.setDiscPercentError("Discount Percent Must Be In [1 - 100] !");
                }
            } catch (Exception e) {
                check = false;
                error.setDiscPercentError("Discount Percent Must Be A Integer Number !");
            }

            if (check) {
                DiscountDTO discount = new DiscountDTO(discountID, discPercent, createDate);
                DiscountDAO dao = new DiscountDAO();
                dao.crateNewDiscount(discount);
                url = SUCCESS;
            }else{
                request.setAttribute("ERROR", error);
            }

        } catch (Exception e) {
            log("ERROR at CreateControler:" + e.toString());
            if (e.toString().contains("duplicate")) {
                error.setDiscountIDError("This Discount ID has already existed !!!!");
                request.setAttribute("ERROR", error);
            }
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
