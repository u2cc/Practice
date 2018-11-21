package com.personal.practice.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ConcurrentPractice {
	public static void main(String[] args) {
		ConcurrentHashMap chm = new ConcurrentHashMap<>();
		chm.putIfAbsent("key", "value");
		CountDownLatch latch = new CountDownLatch(3);
	}
}
