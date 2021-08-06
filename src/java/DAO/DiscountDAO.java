
package DAO;

import DTO.DiscountDTO;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DiscountDAO {

    public boolean checkDiscountUse(String userID, String discountID) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "Select id from tblUsers_Discounts WHERE userID = ? AND discountID = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, userID);
            stm.setString(2, discountID);
            rs = stm.executeQuery();
            while (rs.next()) {
                return false;
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
        return true;
    }
    
    public boolean discountExistence(String discountID) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "Select discountID from tbldiscounts WHERE discountID = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, discountID);
            rs = stm.executeQuery();
            while (rs.next()) {
                return true;
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
        return false;
    }

    public float getDiscountPercent(String discountID) throws SQLException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            String sql = "Select discPercent from tblDiscounts WHERE discountID = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, discountID);
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

    public void insert(String discountID, String userID) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "INSERT INTO tblUsers_Discounts( DiscountID, userID )"
                        + " VALUES(?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, discountID);
                stm.setString(2, userID);
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
    
    public void crateNewDiscount(DiscountDTO discount) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "INSERT INTO tblDiscounts( discountID, discPercent, CreateDate )"
                        + " VALUES(?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, discount.getDiscountID());
                stm.setInt(2, discount.getDiscPercent());
                stm.setDate(3, discount.getCreateDate());
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
    
    public static void main(String[] args) {
        try {
            DiscountDAO dao = new DiscountDAO();
            System.out.println(dao.getDiscountPercent("code1"));
            System.out.println(dao.checkDiscountUse("concobebe", "code1"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
