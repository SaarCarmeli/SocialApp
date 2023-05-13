package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.LoginDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService implements LoginServiceDAO{

    @Override
    public ResponseEntity<?> login(LoginDetails loginDetails) {
        return null;
    }
}
