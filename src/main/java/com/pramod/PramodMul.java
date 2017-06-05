package com.pramod;

public class PramodMul {
   
	public int multiply(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	    return x * y;
	  }
	
	public int division (int x, int y) {
		
		if(y == 0) {
			throw new IllegalArgumentException("Y should not be 0");
		}
		return x /y;
			
	}
}
