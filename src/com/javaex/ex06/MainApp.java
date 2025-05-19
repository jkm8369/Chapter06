package com.javaex.ex06;

public class MainApp {

	public static void main(String[] args) {
		
		Runnable dt = new Digitimpl();
		Runnable lt = new Lowerimpl();
		Runnable ut = new Upperimpl();
		
		
		
		//출장 --> 숫자출력
		Thread t01 = new Thread(dt);
		
		//출장 --> 소문자 출력
		Thread t02 = new Thread(lt);
		
		//출장 --> 대문자 출력
		Thread t03 = new Thread(ut);
	
		
		t01.start();
		t02.start();
		t03.start();
		
		
	}

}
