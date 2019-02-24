package co.com.politecnicojic.apit.exceptions;

import co.com.politecnicojic.apit.Base.Constants;

public class LoginDataIncorrect extends GeneralException {

    public LoginDataIncorrect() {
        super(Constants.WRONG_DATA);
    }
}
