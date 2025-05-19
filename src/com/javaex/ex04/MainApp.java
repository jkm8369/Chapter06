package com.javaex.ex04;

public class MainApp {

	public static void main(String[] args) {
	
		//숫자 출장
		Runnable dt = new DigitThread();
		dt.run();
		
		//대문자 메인
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}