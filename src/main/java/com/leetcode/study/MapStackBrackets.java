package com.leetcode.study;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MapStackBrackets {
	
	public static void main(String[] args) {
		System.out.println(isVaild("{[([})]}"));
		System.out.println(isVaild("{[([])]}"));
		System.out.println(isVaild("{[(3)]}"));
		System.out.println(isVaild("{[]}"));
		System.out.println(isVaild("()"));
		System.out.println(isVaild(""));
	}
	
	private static boolean isVaild(String str) {
		boolean flag = true;
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		// 模拟栈 先进先出 对应括号的关系。key存在时，放入key。 不存在时，取list中最后一次放入的值，看是否匹配得上
		LinkedList<Character> list = new LinkedList<Character>();
		
		// 当传入的字符串为空 或 长度不为2的倍数 或 在map中找不到对应的key值时，不符合要求
		if(!"".equals(str) && !(str.length() % 2 > 0) && map.containsKey(str.charAt(0))) {
			for (Character c : str.toCharArray()) {
				if(map.containsKey(c)) {
					list.add(c);
					// 获取key对应的value与c比较 相等为符合，不等不符合 
				} else if(map.get(list.removeLast()) != c) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		
		return flag;
	}

}
