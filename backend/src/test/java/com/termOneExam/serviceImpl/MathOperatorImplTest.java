package com.termOneExam.serviceImpl;

import com.termOneExam.utils.InvalidOperationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MathOperatorImplTest {

	MathOperatorImpl service =  new MathOperatorImpl();
	
	@Test
	public void add_success() throws InvalidOperationException {
		assertEquals(12, service.doMath(10,2,"+"));
	}
	@Test
	public void add_empty() throws InvalidOperationException {
		assertEquals(0, service.doMath(0,0,"+"));
	}
	@Test
	public void divide_zero() throws InvalidOperationException {
		assertNotEquals(1, service.doMath(1,0,"/"));
	}
	@Test
	public void subtract_success() throws InvalidOperationException {
		assertEquals(8, service.doMath(10,2,"-"));
	}
	@Test
	public void subtract_zero() throws InvalidOperationException {
		assertEquals(5,service.doMath(5,0,"+"));
	}
	@Test
	public void subtract_failure() throws InvalidOperationException {
		assertNotEquals(8, service.doMath(10,2,"+"));
	}
}
