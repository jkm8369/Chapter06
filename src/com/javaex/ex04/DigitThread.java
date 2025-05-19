package com.javaex.ex04;

public class DigitThread implements Runnable{

	@Override
	public void run() {

		for(int i=0; i<=30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

	
}
