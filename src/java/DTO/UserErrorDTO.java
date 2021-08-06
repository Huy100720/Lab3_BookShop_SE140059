
package DTO;


public class UserErrorDTO {
    String userIDError;
    String passwordError;
    String confirmError;
    String userNameError;
    String genderError;
    String emailError;
    String addressError;
    String phoneError;
    String avatarError;

    public UserErrorDTO(String userIDError, String passwordError, String confirmError, String userNameError, String genderError, String emailError, String addressError, String phoneError, String avatarError) {
        this.userIDError = userIDError;
        this.passwordError = passwordError;
        this.confirmError = confirmError;
        this.userNameError = userNameError;
        this.genderError = genderError;
        this.emailError = emailError;
        this.addressError = addressError;
        this.phoneError = phoneError;
        this.avatarError = avatarError;
    }

    public String getUserIDError() {
        return userIDError;
    }

    public void setUserIDError(String userIDError) {
        this.userIDError = userIDError;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

    public String getConfirmError() {
        return confirmError;
    }

    public void setConfirmError(String confirmError) {
        this.confirmError = confirmError;
    }

    public String getUserNameError() {
        return userNameError;
    }

    public void setUserNameError(String userNameError) {
        this.userNameError = userNameError;
    }

    public String getGenderError() {
        return genderError;
    }

    public void setGenderError(String genderError) {
        this.genderError = genderError;
    }

    public String getEmailError() {
        return emailError;
    }

    public void setEmailError(String emailError) {
        this.emailError = emailError;
    }

    public String getAddressError() {
        return addressError;
    }

    public void setAddressError(String addressError) {
        this.addressError = addressError;
    }

    public String getPhoneError() {
        return phoneError;
    }

    public void setPhoneError(String phoneError) {
        this.phoneError = phoneError;
    }

    public String getAvatarError() {
        return avatarError;
    }

    public void setAvatarError(String avatarError) {
        this.avatarError = avatarError;
    }
    
    
    
    
}
