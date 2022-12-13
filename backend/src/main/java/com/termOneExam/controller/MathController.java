package com.termOneExam.controller;

import com.termOneExam.serviceImpl.MathOperatorImpl;
import com.termOneExam.utils.InvalidOperationException;
import com.termOneExam.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.termOneExam.dto.DoMathRequest;

@RestController
@RequestMapping("/api/domath")
public class MathController {

    @Autowired
    private MathOperatorImpl mathOperatorImpl;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Calculator API";
    }

    @PostMapping("/")
    public ResponseEntity<?> doMath(@RequestBody DoMathRequest dto) throws InvalidOperationException {
        return ResponseHandler.generateResponse(HttpStatus.OK, mathOperatorImpl.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation()));
    }
}
