package com.javaex.ex02;

public class MainApp {

	public static void main(String[] args) {
		
		//숫자 출력 --> 출장 --> 스레드
		Thread dt = new DigitThread();  //스레드 생성
		dt.start(); //스레드 시작
		
		//문자 출력 --> 메인
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try { //1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
