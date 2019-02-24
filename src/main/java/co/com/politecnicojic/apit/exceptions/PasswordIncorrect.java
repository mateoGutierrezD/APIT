package co.com.politecnicojic.apit.exceptions;

import co.com.politecnicojic.apit.Base.Constants;

public class PasswordIncorrect extends GeneralException {

    public PasswordIncorrect() {
        super(Constants.WRONG_PASSWORD);
    }
}
