
package DTO;

public class DiscountErrorDTO {
    String discountIDError;
    String discPercentError;

    public DiscountErrorDTO(String discountIDError, String discPercentError) {
        this.discountIDError = discountIDError;
        this.discPercentError = discPercentError;
    }

    public String getDiscountIDError() {
        return discountIDError;
    }

    public void setDiscountIDError(String discountIDError) {
        this.discountIDError = discountIDError;
    }

    public String getDiscPercentError() {
        return discPercentError;
    }

    public void setDiscPercentError(String discPercentError) {
        this.discPercentError = discPercentError;
    }

   

    
}
