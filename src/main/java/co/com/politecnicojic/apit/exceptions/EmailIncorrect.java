package co.com.politecnicojic.apit.exceptions;

import co.com.politecnicojic.apit.Base.Constants;

public class EmailIncorrect extends GeneralException {

        public EmailIncorrect() {
        super(Constants.WRONG_EMAIL);
    }
}
