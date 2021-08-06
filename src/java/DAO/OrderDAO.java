
package DAO;

import DTO.OrderDTO;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class OrderDAO {
    public void insertToOrder(OrderDTO order) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "INSERT INTO tblOrders(orderDate, totalOfOrder, discountID, userID)"
                        + " VALUES(?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setDate(1, order.getOrderDate());
                stm.setFloat(2, order.getTotalOfOrder());
                stm.setString(3, order.getDiscountID());
                stm.setString(4, order.getUserID());
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
    
    public int getOrderID() throws SQLException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "SELECT orderID FROM tblOrders ORDER BY orderID DESC; ";
            stm = conn.prepareStatement(sql);
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
    
    public int getTotalCart(String userID) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "Select count(*) from tblOrders WHERE userID = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, userID);
            rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }          
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (rs != null) {
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
     
    
    public static void main(String[] args) throws SQLException {
        OrderDAO dao = new OrderDAO();
        System.out.println( dao.getTotalCart("concobebe"));
    }
    
}
