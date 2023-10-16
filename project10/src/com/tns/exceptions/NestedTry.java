package com.tns.exceptions;

public class NestedTry {
	public static void check() {
	String str="tns";
	int slength=str.length();
	System.out.println("the length  is"+slength);
	String anotherString="hello";
	int y=6;
	try {//outer try
		int z=y/0;//exception occured
		try {//inner try
			System.out.println(anotherString);//exception arises
			
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("Indexout of Bound"+ex.getMessage());
		}
		catch(NullPointerException ex) {
			System.out.println("Indexout of Bound"+ex.getMessage());
	}
	}
		catch(ArithmeticException ex) {//outer catch
		System.out.println("Arithmetic exception ex"+ex.getMessage());
		}
	}
	}

	
	


	

