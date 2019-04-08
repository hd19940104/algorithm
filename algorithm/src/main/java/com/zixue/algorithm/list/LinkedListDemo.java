package com.zixue.algorithm.list;

import java.util.LinkedList;
import org.junit.Test;

/**
 * 
 * @author houdo 题目： 0-k k-2k 反转
 * @param <T>
 */
public class LinkedListDemo<T> {

	@Test
	public void testReverse() {
		int[] a = new int[100];
		for (int i = 0; i < 100; i++) {
			a[i] = i;
		}
		for (int i : a) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// 开始处理
		LinkedList<Integer> link = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			link.push(a[i]);
		}
		int count = 0;
		for (int i = link.size(); i > 0; i--) {
			int pop = link.pop();
			count++;

			System.out.print(pop + " ");
		}
		System.out.println();
		System.out.println("count:" + count);
	}

	@Test
	public void testReverse2() {
		int[] a = new int[100];
		for (int i = 0; i < 100; i++) {
			a[i] = i;
		}
		for (int i : a) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// 开始处理
		LinkedList<Integer> link = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			link.addFirst(a[i]);

		}
		int count = 0;
		for (int i = link.size(); i > 0; i--) {
			int pop = link.removeFirst();
			count++;

			System.out.print(pop + " ");
		}
		System.out.println();
		System.out.println("count:" + count);
	}
}
