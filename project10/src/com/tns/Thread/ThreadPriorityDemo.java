package com.tns.Thread;

public class ThreadPriorityDemo extends Thread {
	public void run() {
		System.out.println("Thread"+Thread.currentThread().getName()+"running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityDemo t1=new ThreadPriorityDemo();
		ThreadPriorityDemo t2=new ThreadPriorityDemo();
		ThreadPriorityDemo t3=new ThreadPriorityDemo();
		t1.start();
		t2.start();
        t3.start();
        System.out.println("priority of Thread"+t1.getName()+":"+t1.getPriority());
        System.out.println("priority of Thread"+t2.getName()+":"+t2.getPriority());
        System.out.println("priority of Thread"+t3.getName()+":"+t3.getPriority());
        
        
        
		
		
		

	}

}
