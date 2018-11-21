package com.personal.practice;

public class InitializationOrder {
	public String initialValue = "Initialized";
	
	public InitializationOrder() {
		System.out.println(initialValue);
	}
	
	public static void main(String[] args) {
		new InitializationOrder();
	}
}
