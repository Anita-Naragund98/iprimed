package com.prodapt.junit;

public class WrapperProgramEx {
	
	public static void main(String[] args) {
		
		//Older way of auto boxing
		/*
		 * int num=10; Integer convertedInt=Integer.valueOf(num);
		 * System.out.println(convertedInt);
		 */
		
		//no need to use valueOf() compiler will by default
		int count=30;
		Integer a=count;
		System.out.println(a);
		
		/*
		 * Integer c=50; int unbox=c.intValue(); System.out.println(unbox);
		 */
		
		//Auto unboxing
		Integer val=50;
		int unboxValue=val;
		System.out.println(unboxValue);
		}

}
