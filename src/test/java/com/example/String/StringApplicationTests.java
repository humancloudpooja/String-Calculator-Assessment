package com.example.String;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringApplicationTests {

	@Test
	public void testEmptyString()
	{
		assertEquals(0,Calculator.add(""));
	}


}
