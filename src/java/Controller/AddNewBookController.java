package Controller;

import DAO.BookDAO;
import DTO.BookDTO;
import DTO.BookErrorDTO;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class AddNewBookController extends HttpServlet {

    public static final String ERROR = "createBookPage.jsp";
    public static final String SUCCESS = "SearchBookController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String url = ERROR;
        BookErrorDTO error = new BookErrorDTO("", "", "", "", "", "", "", "");
        try {
            String bookID = request.getParameter("bookID");
            String bookTitle = request.getParameter("bookTitle");
            Part part = request.getPart("bookImage");
            String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
            
            String description = request.getParameter("description");
            String pricetxt = request.getParameter("price");
            String quantitytxt = request.getParameter("quantity");
            String author = request.getParameter("author");
            String categoryID = request.getParameter("categoryID");
            float price = 0;
            int quantity = 0;
            long milis = System.currentTimeMillis();
            Date createDate = new java.sql.Date(milis);
            boolean flag = true;

            if (!bookID.matches("^B\\d{3}") || bookID.length() < 1) {
                flag = false;
                error.setBookIDError("Book ID must be like format B-XXX");
            }
            if (bookTitle.length() > 70 || bookTitle.length() < 1) {
                flag = false;
                error.setBookTitleError("Book Title must be [1-70]");
            }
            if (description.length() > 1000 || description.length() < 1) {
                flag = false;
                error.setDescriptionError("Book description must be [1-1000]");
            }
            try {
                price = Float.parseFloat(pricetxt);
                if (price <= 0) {
                    flag = false;
                    error.setPriceError("price must be > 0 ");
                }
            } catch (Exception e) {
                flag = false;
                error.setPriceError("Book's price must be a number ");
            }
            try {
                quantity = Integer.parseInt(quantitytxt);
                if (quantity < 0) {
                    flag = false;
                    error.setQuantityError("quantity must be >= 0 ");
                }
            } catch (Exception e) {
                flag = false;
                error.setQuantityError("Book's quantity must be a number ");
            }
            if (author.length() > 50 || author.length() < 1) {
                flag = false;
                error.setAuthorError("Author must be [1-50]");
            }
            if (!categoryID.matches("^C\\d{3}") || categoryID.length() < 1) {
                flag = false;
                error.setCategoryIDError("Category must be like format C-XXX");
            }
            if (flag) {

                part.write("E:/ChuyenNganhFPT_Ky5/Lab__Java_Web/LAB/Assignment3_Trinh_Gia_Huy/Book_Shopping_SE140059/web/img" + "/" + fileName);
                BookDAO dao = new BookDAO();
                BookDTO newBook = new BookDTO(bookID, bookTitle, fileName, description, price, quantity, author, createDate, categoryID, "Active");
                dao.insert(newBook);
                url = SUCCESS;

            } else {
                request.setAttribute("ERROR", error);
            }

        } catch (Exception e) {
            log("ERROR at CreateControler:" + e.toString());
            if (e.toString().contains("duplicate")) {
                error.setBookIDError("duplicate ID !!!!");
                request.setAttribute("ERROR", error);
            }
            if (e.toString().contains("conflicted")) {
                error.setCategoryIDError("This category ID not existed !!!!");
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
