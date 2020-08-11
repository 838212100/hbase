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
		String str = "ABCA";
		System.out.println(isUnique(str));
		System.out.println('A' & 'B');
		System.out.println(2L & 4L);
		System.out.println(6L & 8L);
		System.out.println(14L & 16L);
	}
	
	/**
	 * 
	 * @param astr
	 * @return
	 */
	public static boolean isUnique(String astr) {
		
		long low64 = 0;
        long high64 = 0;

        for (char c : astr.toCharArray()) {
            if (c >= 64) {
            	// 1L 相当于 long a = 1L ,L表示long 占用8个字节 , 默认为int 所以1L
            	// 位运算符的优先级低于 + - 相当于 1L << (c - 64)
                long bitIndex = 1L << c - 64;
                System.out.println("char = " + c + ", "+ (int)c);
                System.out.println("high64 = " + high64 + ",  \t" + buQuan0(Long.toBinaryString(high64)));
                System.out.println("bitIndex = " + bitIndex + ",  \t" + buQuan0(Long.toBinaryString(bitIndex)));
                System.out.print("high64 & bitIndex = ");
                System.out.println(high64 & bitIndex);
                
                if ((high64 & bitIndex) != 0) {
                    return false;
                }
                System.out.print("high64 |= bitIndex = ");
                System.out.println(high64 |= bitIndex);
                System.out.println("-----------");
                high64 |= bitIndex;
            } else {
                long bitIndex = 1L << c;
                if ((low64 & bitIndex) != 0) {
                    return false;
                }

                low64 |= bitIndex;
            }
        }
        return true;
	}
	
	private static String buQuan0(String str) {
		int len = str.length();
		if(len < 8) {
			String s = "";
			int l = 8 - str.length();
			for (int i = 0; i < l; i++) {
				s += "0";
			}
			str = s + str;
		}
		return str;
	}

}