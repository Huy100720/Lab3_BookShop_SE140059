
package Controller;

import DAO.OrderDAO;
import DAO.OrderDetailDAO;
import DTO.OrderDetailDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HistoryController extends HttpServlet {

    public static final String SUCCESS = "historyPage.jsp";
    public static final String ERROR = "errorHistory.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String name = request.getParameter("bookTitleSearch");
            String orderDate = request.getParameter("orderDateSearch");
            String userID = request.getParameter("userID");
            if(name == null){
                name ="";
            }
            if(orderDate == null){
                orderDate= "";
            }
            OrderDetailDAO oddao = new OrderDetailDAO();
            OrderDAO odao = new OrderDAO();
            int totalCart = odao.getTotalCart(userID);
            List<OrderDetailDTO> list = oddao.getHistory(name, orderDate, userID);
            if(list != null){
                request.setAttribute("HISTORY_LIST", list);
                request.setAttribute("TT_CART", totalCart);
                url = SUCCESS;
            }
            else if (list == null){
                request.setAttribute("MSG", "CAN NOT FIND ");
                url = SUCCESS;
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
