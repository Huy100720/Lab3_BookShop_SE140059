package Controller;

import DAO.BookDAO;
import DTO.BookDTO;
import DTO.UserDTO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchBookController extends HttpServlet {

    public static final String SUCCESS_1 = "shoppingPage.jsp";
    public static final String SUCCESS_2 = "managementPage.jsp";
    public static final String ERROR = "SearchBookError.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            HttpSession session = request.getSession();
            UserDTO user= (UserDTO) session.getAttribute("USER");
            String bookTitle = request.getParameter("bookTitleSearch");
            String category = request.getParameter("categorySearch");
            String price = request.getParameter("priceSearch");
            if (bookTitle == null) {
                bookTitle = "";
            }
            if (category == null) {
                category = "";
            }
            if (price == null || price == "") {
                price = "0";
            }
            if(category.equals("ALL") || category == null){
                category ="";
            }

            int priceParse = Integer.parseInt(price);

            BookDAO dao = new BookDAO();
            List<BookDTO> list = dao.getList(bookTitle, category, priceParse);
            if (list != null && (user == null || user.getRoleID().equals("Us")) ) {
                request.setAttribute("BOOK_LIST", list);
                url = SUCCESS_1;
            } else if(list != null && user.getRoleID().equals("Adm") ){
                list = dao.getListByAdmin(bookTitle);
                request.setAttribute("BOOK_LIST", list);
                url = SUCCESS_2;
            } else if(list == null && (user == null || user.getRoleID().equals("Us")) ){
                url = SUCCESS_1;
            } else if(list == null && user.getRoleID().equals("Adm")){
                url = SUCCESS_2;
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
