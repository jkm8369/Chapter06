package com.javaex.ex05;

public class MainApp {

	public static void main(String[] args) {

		//Runnalble 만들고
		Runnable dt = new DigitThread();  //run 로직(숫자 출력 로직)이 있음
		
		//숫자 출장
		Thread t = new Thread(dt);  //생성자 파라미터로 Runnable만 넣을 수 있다
		//Thread t = new Thread(new DigitThread());
		t.start();
		
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
