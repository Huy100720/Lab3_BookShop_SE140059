
package DTO;

import java.sql.Date;


public class OrderDetailDTO {
    int orderDetailID;
    float price;
    int quantity;
    float total;
    Date orderDate;
    String bookID;
    int orderID;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(float price, int quantity, float total, Date orderDate, String bookID, int orderID) {
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.orderDate = orderDate;
        this.bookID = bookID;
        this.orderID = orderID;
    }

    public OrderDetailDTO(int orderDetailID, float price, int quantity, float total, Date orderDate, String bookID, int orderID) {
        this.orderDetailID = orderDetailID;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.orderDate = orderDate;
        this.bookID = bookID;
        this.orderID = orderID;
    }

    public int getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    

    
    
    
}
