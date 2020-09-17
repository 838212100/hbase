package com.leetcode.study;

public class PalindromeStr {
	
	public static void main(String[] args) {
		
		String str = "asdfdsaqq";
		System.out.println(longPalindrome(str));
		
	}
	
	private static String longPalindrome(String str) {
		int len = str.length();
		if(len < 2) return str;
		
		int maxLen = 1;
		int begin = 0;
		
		// str.charAt(i) 每次都会检查数组下标越界，因此先转换成字符数组
		char[] charArray = str.toCharArray();
		
		// 枚举所有长度大于1的子串 charArray[i...j]
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if(j - i + 1 > maxLen && validPalindromic(charArray, i, j)) {
					maxLen = j - i + 1;
					begin = i;
				}
			}
		}
		
		return str.substring(begin, begin + maxLen);
	}
	
	private static boolean validPalindromic(char[] charArray, int left, int right) {
		while(left < right) {
			if(charArray[left] != charArray[right]) {
				return false;
			}
			left ++;
			right --;
		}
		return true;
	}

}
