package com.tns.Thread;

public class ImplementableThread implements Runnable {
	

	@Override
	public void run() {
		System.out.println("Runnable");
	}
         public static void main(String[] args) {
		// TODO Auto-generated method stub
        	 ImplementableThread ob=new ImplementableThread();
        	 Thread t=new Thread(ob);
        	 t.start();

	}

}
