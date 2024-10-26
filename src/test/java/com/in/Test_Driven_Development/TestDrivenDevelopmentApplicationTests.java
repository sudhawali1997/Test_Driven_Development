package com.in.Test_Driven_Development;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestDrivenDevelopmentApplicationTests {

	@Test
	public void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
	
	@Test
	public void testAddSingleNumber() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(1, calculator.add("1"));
	}
	
	@Test
	public void testAddTwoNumbers() {
		StringCalculator calculator=new StringCalculator();
		assertEquals(4,calculator.add("2,2"));
	}
	
	@Test
	public void testAddMultipleNumbres() {
		StringCalculator calculator=new StringCalculator();
		assertEquals(7,calculator.add("1,2,4"));
	}
	
	@Test
	public void testAddWithNewLineDelimiter() {
		StringCalculator calculator=new StringCalculator();
		assertEquals(6, calculator.add("1\n2,3"));
	}

	@Test
	public void testAddWithCustomDelimiter() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(3, calculator.add("//;\n1;2"));
	}
}
