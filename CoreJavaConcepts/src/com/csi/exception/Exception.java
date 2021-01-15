package com.csi.exception;

import javax.activity.InvalidActivityException;

public class Exception {

	public static void main(String[] args) {
		
		try{
			
			int result = 50 / 0;
			
			System.out.println(result);
		}
		
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException  e)
		
		{
			
			//e.printStackTrace();
			
			System.out.println(e);
			
			
			
			
		}
		
		  finally {
			
			  System.out.println("Always Execute");
		}
		
	}
	
}
