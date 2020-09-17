package com.leetcode.study;

public class BalancedTreeNode {
	
	public static void main(String[] args) {
		
		String str = "qwqqwq";
		
		System.out.println(coutSubStrings(str));
		System.out.println("----------------------------");
		System.out.println(countSubstrings(str));
		System.out.println("----------------------------");
		System.out.println(countSubstrings1(str));
		
		
		
	}
	
	public static int coutSubStrings(String s) {
		int result = 0;
		char[] sArray = s.toCharArray();
		
		for (int i = 0; i < sArray.length ; i++) {
			result++;
			for (int j = i + 1; j < sArray.length; j++) {
//				if(j == sArray.length) break;
				if(sArray[i] == sArray[j]) {
					result += j - i + 1;
					if(j == sArray.length -1) {
						i = j;
					}
				} else {
					System.out.println("j = " + j);
					i = j - 1;
					break;
				}
			}
		}
		
		return result;
	}
	
	public static int countSubstrings(String s) {
        int n = s.length();
        int res = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<=i;++j)
                if(s.charAt(i) == s.charAt(j)&&(i-j<2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                    ++res;
                }
            } 
        return res;
    }
	
	 public static int countSubstrings1(String s) {
	        if(s == null || s.equals("")){
	            return 0;
	        }
	        int n = s.length();
	        boolean[][] dp = new boolean[n][n];
	        int result = s.length();
	        for(int i = 0; i<n; i++) dp[i][i] = true;
	        for(int i = n-1; i>=0; i--){
	            for(int j = i+1; j<n; j++){
	                if(s.charAt(i) == s.charAt(j)) {
	                    if(j-i == 1){
	                        dp[i][j] = true;
	                    }
	                    else{
	                        dp[i][j] = dp[i+1][j-1]; 
	                    }
	                }else{
	                    dp[i][j] = false;
	                }
	                if(dp[i][j]){
	                    result++;
	                }
	            }
	        }
	        return result;
	        
	    }
	
//	public List<List<Integer>> levelOrder(TreeNode root) {
//		if(root==null) {
//			return new ArrayList<List<Integer>>();
//		}
//		
//		List<List<Integer>> res = new ArrayList<List<Integer>>();
//		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
//		//将根节点放入队列中，然后不断遍历队列
//		queue.add(root);
//		while(queue.size()>0) {
//			//获取当前队列的长度，这个长度相当于 当前这一层的节点个数
//			int size = queue.size();
//			ArrayList<Integer> tmp = new ArrayList<Integer>();
//			//将队列中的元素都拿出来(也就是获取这一层的节点)，放到临时list中
//			//如果节点的左/右子树不为空，也放入队列中
//			for(int i=0;i<size;++i) {
//				TreeNode t = queue.remove();
//				tmp.add(t.val);
//				if(t.left!=null) {
//					queue.add(t.left);
//				}
//				if(t.right!=null) {
//					queue.add(t.right);
//				}
//			}
//			//将临时list加入最终返回结果中
//			res.add(tmp);
//		}
//		return res;
//	}

}
