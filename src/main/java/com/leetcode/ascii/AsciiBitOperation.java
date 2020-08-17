package com.leetcode.ascii;

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
		String str = "FDCBA";
		boolean flag = isUnique(str);
		sysout();
		System.out.println(flag);
		
	}
	
	/**
	 * 
	 * @param astr
	 * @return
	 */
	public static boolean isUnique(String astr) {
		System.out.println("输入的串：" + astr);
		System.out.println();
		
		long low64 = 0;
        long high64 = 0;
        System.out.println("字符 \t ASCII值 \t high64 \t 位移量(<<) \t index \t \t & \t |(high64) \t");
        System.out.println();

        for (char c : astr.toCharArray()) {
            if (c >= 64) {
            	// 1L 相当于 long a = 1L ,L表示long 占用8个字节 , 默认为int 所以1L
            	// 位运算符的优先级低于 + - 相当于 1L << (c - 64)
                long bitIndex = 1L << c - 64;
                System.out.println(" \t " + " \t " + " \t " + high64 + " \t  \t " + (int) c + "-64=" + ((int) c - 64) + " \t " + bitIndex + "(1L << " + ((int) c - 64) + ")");
                
                System.out.print(c + " \t " + (int)c);
                System.out.print(" \t  \t " + buQuan0(Long.toBinaryString(high64)) + " \t \t ");
                System.out.print(" \t " + buQuan0(Long.toBinaryString(bitIndex)) + " \t ");
                System.out.print(high64 & bitIndex);
                System.out.print(" \t ");
                
                if ((high64 & bitIndex) != 0) {
                	System.out.println("重复");
                    return false;
                }
                System.out.println(high64 |= bitIndex);
                sysout();
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
	
	/**
	  * 进行0补全
	 * @param str
	 * @return
	 */
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

	private static void sysout() {
		 System.out.println("------------------------------------------------------------------------------------------");
	}
}