package com.javaex.ex03;

public class MainApp {

	public static void main(String[] args) {

		
		//숫자 출장 보내서 일 시키기
		Thread t01 = new DigitThread();
		
		//소문자 출장 보내서 일 시키기
		Thread t02 = new LowerThread();
		
		//대문자 출장 보내서 일 시키기
		Thread t03 = new UpperThread();
		
		//3개 동시에 출력되어야 한다
		t01.start();
		t02.start();
		t03.start();
		
		
		
		
		/*
		Thread dt = new DigitThread();
		dt.start();
		
		Thread lt = new LowerThread();
		lt.start();
		
		Thread ut = new UpperThread();
		ut.start();
		*/
		
		
		
	}

}
