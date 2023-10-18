package com.tns.Thread;

public class CreatingThreadFirst extends Thread  {
	 public void run() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThreadFirst t=new CreatingThreadFirst();//new
	  t.start();
	  t.run();
		
	}
}
