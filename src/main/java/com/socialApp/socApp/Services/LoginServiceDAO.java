package com.socialApp.socApp.Services;

import com.socialApp.socApp.Beans.LoginDetails;
import org.springframework.http.ResponseEntity;

public interface LoginServiceDAO {
    ResponseEntity<?> login(LoginDetails loginDetails);
}
