
package DTO;

import java.sql.Date;

public class DiscountDTO {

    String discountID;
    int discPercent;
    Date createDate;

    public DiscountDTO() {
    }

    public DiscountDTO(String discountID, int discPercent, Date createDate) {
        this.discountID = discountID;
        this.discPercent = discPercent;
        this.createDate = createDate;
    }

    public String getDiscountID() {
        return discountID;
    }

    public void setDiscountID(String discountID) {
        this.discountID = discountID;
    }

    public int getDiscPercent() {
        return discPercent;
    }

    public void setDiscPercent(int discPercent) {
        this.discPercent = discPercent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    
    
}
