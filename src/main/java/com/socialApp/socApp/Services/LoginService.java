package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.LoginDetails;
import org.springframework.http.ResponseEntity;

public class LoginService implements LoginServiceDAO{

    @Override
    public ResponseEntity<?> login(LoginDetails loginDetails) {
        return null;
    }
}
