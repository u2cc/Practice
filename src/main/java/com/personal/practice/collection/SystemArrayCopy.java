package com.personal.practice.collection;

import java.util.ArrayList;

public class SystemArrayCopy {
	public static void main(String[] args) {
		String[] dest = {"a","b","c","d","e"};
		String[] src = {"x","x","x"};
		
		System.arraycopy(src, 0, dest, 0, 3);
		
		for(String a:dest) {
			System.out.println(a);
		}
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("x");
		arrayList.add("x");
		arrayList.add("x");
		
		dest = arrayList.toArray(dest);
		for(String d:dest) {
			System.out.println(d);
		}
		//output indicates that the dest array wont be "rest" beyond T[arrayList.size]
	}
}
