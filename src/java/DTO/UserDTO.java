
package DTO;

import java.sql.Date;


public class UserDTO {
    String userID;
    String password;
    String userName;
    float wallet;
    String gender;
    String email;
    String address;
    String phone;
    String avatar;
    Date createDate;
    String roleID;
    String status;

    public UserDTO() {
    }

    public UserDTO(String userID, String password, String userName, float wallet, String gender, String email, String address, String phone, String avatar, Date createDate, String roleID, String status) {
        this.userID = userID;
        this.password = password;
        this.userName = userName;
        this.wallet = wallet;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.avatar = avatar;
        this.createDate = createDate;
        this.roleID = roleID;
        this.status = status;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getWallet() {
        return wallet;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

   
    
}
