
package Controller;


import DAO.UserDAO;
import DTO.UserDTO;
import DTO.UserErrorDTO;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterController extends HttpServlet {

    public static final String SUCCESS = "registerPage.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = SUCCESS;
        UserErrorDTO userError = new UserErrorDTO("", "", "", "", "", "", "", "", "");
        try {
            String userID = request.getParameter("userID");
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String confirm = request.getParameter("confirm");
            String gender = request.getParameter("gender");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String avatar = request.getParameter("avatar");
            long milis = System.currentTimeMillis();
            Date createDate = new java.sql.Date(milis);
            boolean flag = true;
            
            if (userID.length() > 50 || userID.length() < 5) {
                flag = false;
                userError.setUserIDError("User Id must must be [5-50]");
            }           
            if (userName.length() > 50 || userName.length() < 5) {
                flag = false;
                userError.setUserNameError("User Name must be [5-50]");
            }
            if (password.length() > 50 || password.length() < 2 ) {
                flag = false;
                userError.setPasswordError("password must be [2-50]");
            }
            if (!password.equals(confirm)) {
                flag = false;
                userError.setConfirmError("password and confirm must be the same");
            }
            if (!gender.equals("Male") && !gender.equals("Female")) {
                flag = false;
                userError.setGenderError("Gender must be Male or Female]");
            }
            if (!email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") ) {
                flag = false;
                userError.setEmailError("Email must like  ________@___.com");
            }
            if (address.length() > 70 || address.length() < 5) {
                flag = false;
                userError.setAddressError("Address must be [5-70]");
            }
            if (phone.length() != 10 ) {
                flag = false;
                userError.setPhoneError("Phone must be 10 number");
            }
            if (avatar.length() > 200 || avatar.length() < 5) {
                flag = false;
                userError.setAvatarError("Avatar must be [5-70]");
            }
                               
            if (flag) {                
                UserDAO dao = new UserDAO();
                UserDTO newUser = new UserDTO(userID, password, userName, 1000, gender, email, address, phone, avatar, createDate, "Us", "Active");
                dao.insertUser(newUser);
                request.setAttribute("MSG", "REGISTER SUCCESSFUL");
                
            } else {
                request.setAttribute("ERROR", userError);
                request.setAttribute("MSG", "REGISTER FAILED");
            }
            
        } catch (Exception e) {
            log("ERROR at RegisterControler:" + e.toString());
            if (e.toString().contains("duplicate")) {
                userError.setUserIDError("This User ID has already existed !!!!");
                request.setAttribute("ERROR", userError);
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
