/**
 * 
 */
package com.pramod;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Pramod Mekapothula
 *
 */
public class PramodMulTest {
 
	  @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
	    PramodMul tester = new PramodMul();
	    tester.multiply(1000, 5);
	  }

	  @Test
	  public void testMultiply() {
		  PramodMul tester = new PramodMul();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }

	  @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrowned()
	  {
		  PramodMul pram = new PramodMul();
		  pram.division(1000, 0);
	  }
	  
	  @Test
	  public void testDiv() {
		  PramodMul pram = new PramodMul();
		assertEquals("10 / 5 must be 2", 2 , pram.division(10, 5)); 
		}
	  
	  @Test
	  public void testMultiply1() {
		  PramodMul tester = new PramodMul();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }
	  
	  //added negative numbers test cases
	  @Test
	  public void testDiv1() {
		  PramodMul pram = new PramodMul();
		assertEquals("10 / 5 must be 2", 2 , pram.division(-10, -5)); 
		}
}
