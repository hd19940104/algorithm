package com.zixue.algorithm.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * 
 * @author houdo
 *
 */
public class HashMapDemo extends HashMap<String, String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1982547219783255139L;

	public static void main(String[] args) {
		HashMap<String, String> map = new  HashMapDemo();
		map.put("1", "1");
		map.put("2", "2");
		
		System.out.println(map.toString());
		for (Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext();) {
			String next = iterator.next();
			System.out.println(map.get(next));
		}
	}
}
