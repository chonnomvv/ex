package com.javaex.collections.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < 10; i++) {
			q.offer(i);
		}
		
		System.out.println(q);
		
		int val = q.poll();
		System.out.println("poll:" + val);
		System.out.println(q);
		val = q.peek();
		System.out.println("peek:" + val);
		System.out.println(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
