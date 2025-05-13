package com.hexaware.test;

import static org.junit.jupiter.api.Assertions.*;

import static  java.lang.System.out;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hexaware.app.Calculator;



class CalculatorTest {
	
	static  Calculator c ;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		 c  = new Calculator();
		
		System.out.println("Before All executed..");
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("After All executed...");
	}

	@Test
	@DisplayName("Add_Test")
	void testAdd() {
		
		
		
		
		int actual =  c.add(5, 5);
		
			assertEquals(10, actual);
		
			System.out.println("add test executed..");
		
	}

	@Test
	void testSub() {
		
		
				assertNotEquals(15 , c.sub(10, 5));
		
	}

	@Test
	@Disabled
	void testMul() {
		
				assertTrue(c.mul(5, 4)  > 10);
		
	}

	@Test
	void testDiv() {
		
		//assertEquals(5, c.div(10, 0));
		
				//assertThrows(null, null)
		
		assertThrows(ArithmeticException.class, ()->{
			
				c.div(10, 0);
			
		});
		
	}

}
