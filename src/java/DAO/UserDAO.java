package DAO;

import DTO.UserDTO;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public UserDTO checkLoginUser(String userID, String password) throws SQLException {
        UserDTO user = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " SELECT userID, password, userName, wallet, gender, email, address, phone, avatar, createDate, roleID, status "
                        + " FROM tblUsers "
                        + " Where userID = ? AND password = ? AND status = 'Active'";
                stm = conn.prepareStatement(sql);
                stm.setString(1, userID);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String userName = rs.getString("userName");
                    float wallet = rs.getFloat("wallet");
                    String gender = rs.getString("gender");
                    String email = rs.getString("email");
                    String address = rs.getString("address");
                    String phone = rs.getString("phone");
                    String avatar = rs.getString("avatar");
                    Date createDate = rs.getDate("createDate");
                    String roleID = rs.getString("roleID");
                    String status = rs.getString("status");
                    user = new UserDTO(userID, "****", userName, wallet, gender, email, address, phone, avatar, createDate, roleID, status);
                }
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
        return user;
    }

    public void insertUser(UserDTO user) throws SQLException, ClassNotFoundException {
        boolean check = false;
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "INSERT INTO tblUsers(userID, password, userName, wallet, gender, email, address, phone, avatar, createDate, roleID, status)"
                        + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, user.getUserID());
                stm.setString(2, user.getPassword());
                stm.setString(3, user.getUserName());
                stm.setFloat(4, user.getWallet());
                stm.setString(5, user.getGender());
                stm.setString(6, user.getEmail());
                stm.setString(7, user.getAddress());
                stm.setString(8, user.getPhone());
                stm.setString(9, user.getAvatar());
                stm.setDate(10, user.getCreateDate());
                stm.setString(11, user.getRoleID());
                stm.setString(12, user.getStatus());
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

    public boolean updateWallet(String userID, float wallet) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "UPDATE tblUsers SET wallet = ? "
                        + " WHERE userID = ?";
                stm = conn.prepareStatement(sql);
                stm.setFloat(1, wallet);
                stm.setString(2, userID);
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

    public static void main(String[] args) {
        try {

            UserDAO dao = new UserDAO();

//            long milis = System.currentTimeMillis();
//            Date createDate = new java.sql.Date(milis);
//            
//            UserDTO user = new UserDTO("namchamvang20", "123", "Trinh Trung Hieu", "Male", "hieuvip123@gmail.com",
//                    "385/46 P.Tam Hiep Tp.Bien Hoa", "9999999999", "https://th.bing.com/th/id/OIP.StfVo2xWVSl6OM0nqwfNtAHaG0?pid=ImgDet&rs=1", 
//                    createDate, "US", "Active");
//            dao.insertUser(user);
            boolean check = dao.updateWallet("namchamvang6", 500);
            System.out.println(check);
            UserDTO user = dao.checkLoginUser("namchamvang6", "123");
            System.out.println(user.getUserName() + user.getWallet());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
