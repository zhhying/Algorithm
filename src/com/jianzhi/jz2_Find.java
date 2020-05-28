package com.jianzhi;
/*
 * ��Ŀ����
 * ����һ����ά���飬��ÿһ�д����ҵ������򣬴��ϵ���Ҳ�ǵ������򡣸���һ�������ж�������Ƿ��ڸö�ά������
 * ����˼·
*Ҫ��ʱ�临�Ӷ� O(M + N)���ռ临�Ӷ� O(1)������ M Ϊ������N Ϊ ������
�ö�ά�����е�һ������С��������һ��������ߣ�����������һ�������±ߡ���ˣ������Ͻǿ�ʼ���ң��Ϳ��Ը�
�� target �͵�ǰԪ�صĴ�С��ϵ����С�������䣬��ǰԪ�صĲ�������Ϊ���½ǵ�����Ԫ�ء�
 */

public class jz2_Find {
	public boolean Find(int target,int[][] matrix) {
		if(matrix==null||matrix.length==0||matrix[0].length==0)
			return false;
		int rows=matrix.length,cols=matrix[0].length;
		int r=0,c=cols-1;
		while(r<=rows-1&&c>=0) {
			if(target==matrix[r][c])
				return true;
			else if(target>matrix[r][c])
				r++;
			else
				c--;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target=5;
		jz2_Find m=new jz2_Find();
		System.out.println(m.Find(target, matrix));

	}

}
