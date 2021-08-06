
package DTO;

import java.sql.Date;


public class BookDTO {
    String bookID;
    String bookTitle;
    String bookImage;
    String description;
    float price;
    int quantity;
    String author;
    Date createDate;
    String categoryID;
    String bookStatus;

    public BookDTO() {
    }

    public BookDTO(String bookID, String bookTitle, String bookImage, float price, int quantity) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookImage = bookImage;
        this.price = price;
        this.quantity = quantity;
    }

    public BookDTO(String bookID, String bookTitle, String bookImage, String description, float price, int quantity, String author, Date createDate, String categoryID, String bookStatus) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookImage = bookImage;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
        this.createDate = createDate;
        this.categoryID = categoryID;
        this.bookStatus = bookStatus;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    
    
}
