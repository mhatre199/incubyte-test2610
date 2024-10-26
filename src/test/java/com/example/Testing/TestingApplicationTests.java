package com.example.Testing;

import com.example.Testing.logic.StringCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class TestingApplicationTests {

	@Test
	public void testEmptyStringReturnsZero() {
		assertEquals(15, StringCalculator.add("10,5"));
	}




	@Test
	public void testSingleNumberReturnsThatNumber() {
		assertEquals(5, StringCalculator.add("5"));
	}


	@Test
	public void testNumbersNewLine() {
		assertEquals(15, StringCalculator.add("4\n5\n6"));
	}

	@Test
	void testNegativeNumberException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			StringCalculator.add("1,-2,3");
		});
		assertEquals("Negative numbers not allowed: -2", exception.getMessage());

		exception = assertThrows(IllegalArgumentException.class, () -> {
			StringCalculator.add("-1,-2,-3");
		});
		assertEquals("Negative numbers not allowed: -1", exception.getMessage());
	}


	@Test
	void testGetCalledCount() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.GetCalledCount());

		calculator.add("1,2");
		assertEquals(1, calculator.GetCalledCount());

		calculator.add("3,4");
		assertEquals(2, calculator.GetCalledCount());
	}



}
