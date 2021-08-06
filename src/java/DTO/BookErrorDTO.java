
package DTO;

import java.sql.Date;

public class BookErrorDTO {
    String bookIDError;
    String bookTitleError;
    String bookImageError;
    String descriptionError;
    String priceError;
    String quantityError;
    String authorError;
    String categoryIDError;

    public BookErrorDTO(String bookIDError, String bookTitleError, String bookImageError, String descriptionError, String priceError, String quantityError, String authorError, String categoryIDError) {
        this.bookIDError = bookIDError;
        this.bookTitleError = bookTitleError;
        this.bookImageError = bookImageError;
        this.descriptionError = descriptionError;
        this.priceError = priceError;
        this.quantityError = quantityError;
        this.authorError = authorError;
        this.categoryIDError = categoryIDError;
    }

    public String getBookIDError() {
        return bookIDError;
    }

    public void setBookIDError(String bookIDError) {
        this.bookIDError = bookIDError;
    }

    public String getBookTitleError() {
        return bookTitleError;
    }

    public void setBookTitleError(String bookTitleError) {
        this.bookTitleError = bookTitleError;
    }

    public String getBookImageError() {
        return bookImageError;
    }

    public void setBookImageError(String bookImageError) {
        this.bookImageError = bookImageError;
    }

    public String getDescriptionError() {
        return descriptionError;
    }

    public void setDescriptionError(String descriptionError) {
        this.descriptionError = descriptionError;
    }

    public String getPriceError() {
        return priceError;
    }

    public void setPriceError(String priceError) {
        this.priceError = priceError;
    }

    public String getQuantityError() {
        return quantityError;
    }

    public void setQuantityError(String quantityError) {
        this.quantityError = quantityError;
    }

    public String getAuthorError() {
        return authorError;
    }

    public void setAuthorError(String authorError) {
        this.authorError = authorError;
    }

    public String getCategoryIDError() {
        return categoryIDError;
    }

    public void setCategoryIDError(String categoryIDError) {
        this.categoryIDError = categoryIDError;
    }

    
    
}
