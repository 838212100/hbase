package com.ascii;

public class AsciiBitOperation {
	
	/**
	  * 题目描述
	  * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
	  * 示例 1：
	  * 输入: s = "leetcode"
	  * 输出: false
	 * 
	  * 示例 2：
	  * 输入: s = "abc"
	  * 输出: true
	 * 
	  * 限制：
	 * 0 <= len(s) <= 100
	  * 如果你不使用额外的数据结构，会很加分
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "qweraq";
		System.out.println(isUnique(str));
	}
	
	public static boolean isUnique(String astr) {
		
		char[] array = astr.toCharArray();
		for(char c : array) {
			if(c >= 64) {
				System.out.println(c);
			}
		}
		
		return false;
	}

}
