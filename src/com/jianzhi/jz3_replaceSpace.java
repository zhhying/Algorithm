package com.jianzhi;
/*
 * ��Ŀ����
 * ��һ���ַ����еĿո��滻�� "%20"��
 * ����˼·
 * ���ַ���β����������ַ���ʹ���ַ����ĳ��ȵ����滻֮��ĳ��ȡ���Ϊһ���ո�Ҫ�滻�������ַ���%20������
           �˵�������һ���ո�ʱ����Ҫ��β��������������ַ���
           �� P1 ָ���ַ���ԭ����ĩβλ�ã�P2 ָ���ַ������ڵ�ĩβλ�á�P1 �� P2 �Ӻ���ǰ�������� P1 ������һ���ո�
ʱ������Ҫ�� P2 ָ���λ��������� 02%��ע��������ģ������������� P1 ָ���ַ���ֵ��
�Ӻ���ǰ����Ϊ���ڸı� P2 ��ָ�������ʱ������Ӱ�쵽 P1 ����ԭ���ַ���������
 */
public class jz3_replaceSpace {
	public String replaceSpace(StringBuffer str) {
		int p1=str.length()-1;
		for(int i=0;i<=p1;i++) {
			if(str.charAt(i)==' ')
				str.append("  ");
		}
		int p2=str.length()-1;
		while(p1>=0&&p2>p1) {
			char c=str.charAt(p1--);
			if(c==' ') {
				str.setCharAt(p2--, '0');
				str.setCharAt(p2--, '2');
				str.setCharAt(p2--, '%');

			}else {
				str.setCharAt(p2--, c);
			}
		}
		return str.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringBuffer str=new StringBuffer("A B");
		jz3_replaceSpace s=new jz3_replaceSpace();
		System.out.println(s.replaceSpace(str));
	}

}
