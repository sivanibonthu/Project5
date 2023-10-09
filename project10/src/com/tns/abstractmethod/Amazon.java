package com.tns.abstractmethod;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int amt;

	    Scanner sc=new Scanner(System.in);

	    		System.out.println("enter amount");

	    amt=sc.nextInt();

	    Accounts a;

	    a=new NonPrime(amt);

		}
	}

