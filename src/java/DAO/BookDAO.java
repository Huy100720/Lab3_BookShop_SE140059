package DAO;

import DTO.BookDTO;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<BookDTO> getList(String bookTitleSearch, String categorySearch, float priceSearch) throws SQLException {
        List<BookDTO> list = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT bookID, bookTitle, bookImage, description, price, quantity, author, createDate, categoryID, bookStatus "
                        + " FROM tblBooks "
                        + " WHERE bookStatus = 'Active' AND quantity > 0 AND bookTitle like ? AND categoryID like ? AND price > ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + bookTitleSearch + "%");
                stm.setString(2, "%" + categorySearch + "%");
                stm.setFloat(3, priceSearch);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String bookID = rs.getString("bookID");
                    String bookTitle = rs.getString("bookTitle");
                    String bookImage = rs.getString("bookImage");
                    String description = rs.getString("description");
                    float price = rs.getFloat("price");
                    int quantity = rs.getInt("quantity");
                    String authour = rs.getString("author");
                    Date date = rs.getDate("createDate");
                    String categoryID = rs.getString("categoryID");
                    String bookStatus = rs.getString("bookStatus");
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(new BookDTO(bookID, bookTitle, bookImage, description, price, quantity, authour, date, categoryID, bookStatus));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public boolean delete(String bookID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE tblBooks SET bookStatus = 'Inactive' WHERE bookID = ? ";
                stm = conn.prepareStatement(sql);
                stm.setString(1, bookID);
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean update(BookDTO book) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE tblBooks SET bookTitle =?, bookImage = ?, description =?, price = ?, quantity = ?, author = ?, createDate = ? "
                        + " WHERE bookID = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, book.getBookTitle());
                stm.setString(2, book.getBookImage());
                stm.setString(3, book.getDescription());
                stm.setFloat(4, book.getPrice());
                stm.setInt(5, book.getQuantity());
                stm.setString(6, book.getAuthor());
                stm.setDate(7, book.getCreateDate());
                stm.setString(8, book.getBookID());
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public void insert(BookDTO book) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "INSERT INTO tblBooks(bookID, bookTitle, bookImage, description, price, quantity, author, createDate, categoryID, bookStatus)"
                        + " VALUES(?,?,?,?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, book.getBookID());
                stm.setString(2, book.getBookTitle());
                stm.setString(3, book.getBookImage());
                stm.setString(4, book.getDescription());            
                stm.setFloat(5, book.getPrice());
                stm.setInt(6, book.getQuantity());
                stm.setString(7, book.getAuthor());
                stm.setDate(8, book.getCreateDate());
                stm.setString(9, book.getCategoryID());
                stm.setString(10, book.getBookStatus());
                stm.executeUpdate();
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    public boolean updateQuantity(int quantity , String bookID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE tblBooks SET quantity =? WHERE bookID = ?";
                stm = conn.prepareStatement(sql);
                stm.setInt(1, quantity);
                stm.setString(2, bookID);
                check = stm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }
    
    public int getQuantity(String bookID) throws SQLException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "SELECT quantity FROM tblBooks WHERE bookID = ? ";
            stm = conn.prepareStatement(sql);
            stm.setString(1, bookID);
            rs = stm.executeQuery();
            while(rs.next()){
                return rs.getInt(1);
            } 
        } catch (Exception e) {
        }if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (conn != null) {
            conn.close();
        }       
        return -1;
    }

     public List<BookDTO> getListByAdmin(String bookTitleSearch) throws SQLException {
        List<BookDTO> list = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT bookID, bookTitle, bookImage, description, price, quantity, author, createDate, categoryID, bookStatus "
                        + " FROM tblBooks "
                        + " WHERE bookStatus = 'Active' AND bookTitle like ? ";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + bookTitleSearch + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String bookID = rs.getString("bookID");
                    String bookTitle = rs.getString("bookTitle");
                    String bookImage = rs.getString("bookImage");
                    String description = rs.getString("description");
                    float price = rs.getFloat("price");
                    int quantity = rs.getInt("quantity");
                    String authour = rs.getString("author");
                    Date date = rs.getDate("createDate");
                    String categoryID = rs.getString("categoryID");
                    String bookStatus = rs.getString("bookStatus");
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(new BookDTO(bookID, bookTitle, bookImage, description, price, quantity, authour, date, categoryID, bookStatus));
                }
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }
     
     public static void main(String[] args) {
         try {
            BookDAO dao = new  BookDAO();
            List<BookDTO> list = dao.getListByAdmin("");
             for (BookDTO bookDTO : list) {
                 System.out.println(bookDTO);
             }
         } catch (Exception e) {
         }
    }
}
