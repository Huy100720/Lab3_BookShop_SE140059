package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainController extends HttpServlet {

    public final static String LOGIN = "LoginController";
    public final static String LOGOUT = "LogoutController";
    
    private static final String SEARCH_BOOK = "SearchBookController";
    private static final String ADD_TO_CART = "AddToCartController";
    private static final String DELETE_BOOK = "DeleteBookController";
    private static final String CONFIRM_UPDATE = "UpdateBookController";
    private static final String ADD_BOOK = "AddNewBookController";
    private static final String REGISTER = "RegisterController";
    private static final String DELETE_BOOK_IN_CART = "DeleteBookInCartController";
    private static final String UPDATE_QUANTITY_IN_CART = "UpdateQuantityController";
    private static final String PAY_CART = "CheckoutController";
    private static final String GET_HISTORY = "HistoryController";
    private static final String SEARCH_HISTORY = "HistoryController";
    private static final String CHECK_CODE = "CheckDiscountController";
    private static final String ADD_DISCOUNT = "AddNewDiscountController";
    
    private static final String UPDATE_BOOK = "updatePage.jsp";
    private static final String VIEW_PRODUCT_DETAIL_PAGE = "bookDetail.jsp";
    private static final String REGISTER_PAGE = "registerPage.jsp";
    private static final String LOGIN_PAGE = "loginPage.jsp";
    public final static String ERROR_PAGE = "ErrorMain.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String url = ERROR_PAGE;
        try {
            String action = request.getParameter("action");
            if ("Login".equals(action)) {
                url = LOGIN;
            } else if ("Logout".equals(action)) {
                url = LOGOUT;
            } else if ("Register".equals(action)) {
                url = REGISTER_PAGE;
            } else if ("Back To Login Page".equals(action)) {
                url = LOGIN_PAGE;
            } else if ("Search".equals(action)) {
                url = SEARCH_BOOK;
            } else if ("AddToCart".equals(action)) {
                url = ADD_TO_CART;
            } else if ("ViewDetail".equals(action)) {
                url = VIEW_PRODUCT_DETAIL_PAGE;
            } else if ("Search Book".equals(action)) {
                url = SEARCH_BOOK;
            } else if ("Update Book".equals(action)) {
                url = UPDATE_BOOK;
            } else if ("Delete".equals(action)) {
                url = DELETE_BOOK;
            } else if ("Create Book".equals(action)) {
                url = ADD_BOOK;
            } else if ("Confirm".equals(action)) {
                url = CONFIRM_UPDATE;
            } else if ("Finish".equals(action)) {
                url = REGISTER;
            } else if ("DeleteBookInCart".equals(action)) {
                url = DELETE_BOOK_IN_CART;
            } else if ("UpdateQuantity".equals(action)) {
                url = UPDATE_QUANTITY_IN_CART;
            } else if ("Pay".equals(action)) {
                url = PAY_CART;
            } else if ("History".equals(action)) {
                url = GET_HISTORY;
            } else if ("Search History".equals(action)) {
                url = SEARCH_HISTORY;
            } else if ("Check Code".equals(action)) {
                url = CHECK_CODE;
            } else if ("Create Discount".equals(action)) {
                url = ADD_DISCOUNT;
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
