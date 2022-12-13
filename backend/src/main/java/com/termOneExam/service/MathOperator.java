package com.termOneExam.service;

import com.termOneExam.utils.InvalidOperationException;
import org.springframework.stereotype.Service;

public interface MathOperator {

	double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
