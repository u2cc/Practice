package com.personal.practice.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
/**
 * 
 * @author cc03091
 *
 */
public class MethodReferencePractice {
	
	public int number = 0;
	public void methodOne(MethodReferencePractice mRP) {
		mRP.number = 10;
	}
	
	public static void methodTwo(MethodReferencePractice mRP) {
		mRP.number = 10;
	}
	
	public static void main(String[] args) {
		
		MethodReferencePractice mRP = new MethodReferencePractice();
		Map<String, Consumer<MethodReferencePractice>> methodMap = new HashMap<String, Consumer<MethodReferencePractice>>();
		
		methodMap.put("MethodOne", mRP::methodOne);
		methodMap.put("MethodTwo", MethodReferencePractice::methodTwo);
		
		methodMap.get("MethodTwo").accept(mRP);
		
		
				
		System.out.println(mRP.number);
	}
}
