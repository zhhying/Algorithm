package com.jianzhi;

/**
 * 
 * @author zhanghaiying
 *��һ������Ϊ n ����������������ֶ��� 0 �� n-1 �ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м����������ظ��ģ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
 *����˼·:
 *Ҫ��ʱ�临�Ӷ� O(N)���ռ临�Ӷ� O(1)����˲���ʹ������ķ�����Ҳ����ʹ�ö���ı�����顣
 *������������Ԫ���� [0, n-1] ��Χ�ڵ����⣬���Խ�ֵΪ i ��Ԫ�ص������� i ��λ���Ͻ�����⡣
 */
public class jz1_duplicate {
	public boolean duplicate(int[] nums,int length,int[] duplication) {
		if(nums==null||length<=0) {
			return false;
		}
		for(int i=0;i<length;i++) {
			while(nums[i]!=i) {
				if(nums[i]==nums[nums[i]]) {
					duplication[0]=nums[i];
					return true;
				}
				swap(nums,i,nums[i]);
			}
		}
		return false;
		
	}
	private void swap(int[] nums,int i,int j) {
		int t=nums[i];
		nums[i]=nums[j];
		nums[j]=t;
	}
	public static void main(String[] args) {
		int[] nums= {2,3,1,0,2,5};
		int length=nums.length;
		int[] duplication=new int[length];
		jz1_duplicate s=new jz1_duplicate();
		boolean m=s.duplicate(nums, length, duplication);
		System.out.println(m);
	}

}
