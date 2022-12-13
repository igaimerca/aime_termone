package com.termOneExam.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> generateResponse(HttpStatus status, double data) {
        Map<String, Object> map = new HashMap<>();
        try {
            System.out.println("dddd " + data);
            map.put("calcResponse", data);
            map.put("status", status.value());
            return new ResponseEntity<Object>(map,status);
        } catch (Exception e) {
            map.clear();
            map.put("calcResponse", data);
            map.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            return new ResponseEntity<Object>(map,status);
        }
    }
}