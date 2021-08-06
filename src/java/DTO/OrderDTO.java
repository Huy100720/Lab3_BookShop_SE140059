
package DTO;

import java.sql.Date;


public class OrderDTO {
    int orderID;
    Date OrderDate;
    float totalOfOrder;
    String discountID;
    String userID;

    public OrderDTO() {
    }
    
    public OrderDTO(Date OrderDate, float totalOfOrder, String discountID, String userID) {
        this.OrderDate = OrderDate;
        this.totalOfOrder = totalOfOrder;
        this.discountID = discountID;
        this.userID = userID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public float getTotalOfOrder() {
        return totalOfOrder;
    }

    public void setTotalOfOrder(float totalOfOrder) {
        this.totalOfOrder = totalOfOrder;
    }

    public String getDiscountID() {
        return discountID;
    }

    public void setDiscountID(String discountID) {
        this.discountID = discountID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    
}
