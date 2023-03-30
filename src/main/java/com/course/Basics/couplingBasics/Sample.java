package com.course.Basics.couplingBasics;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	public static Map<Character, Integer> frequency(String s){
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map =new HashMap<>();
		for(char c : charArray) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		return map;
	}
	
	public static void main(String[] args) {
		String s = "Harsh";
		System.out.println(frequency(s.toLowerCase()));
	}
}
