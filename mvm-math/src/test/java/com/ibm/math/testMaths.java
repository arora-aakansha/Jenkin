package com.ibm.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.Maths;

public class testMaths {
	private static Maths maths;
	
	@BeforeAll
	public static void setup() {
		maths = new Maths();
		
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, maths.add(5, 5));
	}
	
	@Test
	public void testdiv(){
		assertEquals(1, maths.div(3, 3));
	}
	
	public void invaliddiv() {
		assertEquals(2,maths.div(4, 2));
	}
	
}
