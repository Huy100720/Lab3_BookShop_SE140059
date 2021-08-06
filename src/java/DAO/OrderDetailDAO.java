package DAO;

import DTO.OrderDetailDTO;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailDAO {

    public void insertToOrderDetail(OrderDetailDTO orderDetail) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "INSERT INTO tblOrderDetails (price, quantity, total, orderDate, bookID, orderID)"
                        + " VALUES(?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setFloat(1, orderDetail.getPrice());
                stm.setInt(2, orderDetail.getQuantity());
                stm.setFloat(3, orderDetail.getTotal());
                stm.setDate(4, orderDetail.getOrderDate());
                stm.setString(5, orderDetail.getBookID());
                stm.setInt(6, orderDetail.getOrderID());
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

    public List<OrderDetailDTO> getHistory(String bookName, String orderDate, String userID) throws SQLException {
        List<OrderDetailDTO> list = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT B.orderDetailID, CAST(ROUND(B.price, 2) AS NUMERIC(36,2)), B.quantity, CAST(ROUND(B.total, 2) AS NUMERIC(36,2)), B.orderDate, A.bookTitle, B.orderID "
                        + " FROM tblBooks A JOIN  tblOrderDetails B ON  A.bookID = B.bookID "
                        + " JOIN tblOrders C ON B.orderID = C.orderID "
                        + " WHERE A.bookTitle like ? AND C.orderDate like ? AND C.userID = ? ";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + bookName + "%");
                stm.setString(2, "%" + orderDate + "%");
                stm.setString(3, userID);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int orderDetailID = rs.getInt("orderDetailID");
                    float price = rs.getFloat(2);
                    int quantity = rs.getInt("quantity");
                    float total = rs.getFloat(4);
                    Date date = rs.getDate("orderDate");
                    String bookTitle = rs.getString("bookTitle");
                    int orderID = rs.getInt("orderID");
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(new OrderDetailDTO(orderDetailID, price, quantity, total, date, bookTitle, orderID));
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
            OrderDetailDAO dao = new OrderDetailDAO();
            List<OrderDetailDTO> list = dao.getHistory("", "", "concobebe");
            for (OrderDetailDTO dto : list) {
                System.out.println(dto.getBookID() + " "+ dto.getPrice() +" " + dto.getTotal());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
