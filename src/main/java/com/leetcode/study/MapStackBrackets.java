package com.leetcode.study;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
  * 题目描述：
  * 输入一个字符串，判断该括号字符串是否按一定顺序放入的，括号分别有()、[]、{}。例如 () 、{[]} 、{[()]} 均为合格， 例如 {[(]} 、{[)(]} 为不合格 
  * 思路：
  * 括号是固定的，放入map作为校验的内容
  * 既然是有顺序的，以先进后出的形式来做(栈)，先放入的在栈底，
  * 循环判断每个字符是否为map中的key，为key继续，不为key需要判断该字符是否等于栈底字符key对应的value值，相等则符合要求，不等则退出为不符合
 * @author yang
 *
 */
public class MapStackBrackets {
	
	public static void main(String[] args) {
		System.out.println(isVaild("{[([})]}"));
		System.out.println(isVaild("{[([])]}"));
		System.out.println(isVaild("{[(3)]}"));
		System.out.println(isVaild("{[]}"));
		System.out.println(isVaild("{[()()]}"));
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