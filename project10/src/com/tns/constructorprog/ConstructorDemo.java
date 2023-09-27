package com.tns.constructorprog;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String name,city;
      int id;
      System.out.println("enter customer id");
      id=sc.nextInt();
      sc.nextLine();
      
      System.out.println("enter customer name");
      name=sc.nextLine();
      
      System.out.println("enter customer city");
      city=sc.nextLine();
      Customer c1=new Customer(name,id,city);
  //    c1.setCustomerId(id);
  //    c1.setCustomerName(name);
  //     c1.setCustomerCity(city);
      System.out.println(c1);
	}

}
