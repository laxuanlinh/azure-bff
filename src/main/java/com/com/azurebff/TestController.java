package com.com.azurebff;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/api/user")
    public ResponseEntity<Map<String, Object>> test(Authentication user){
        Map<String, Object> res = new HashMap<>();
        res.put("username", user.getName());
        res.put("credentials", user.getCredentials());
        res.put("principal", user.getPrincipal());
        res.put("isAuthenticated", user.isAuthenticated());
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
