package com.prctice.crm;

import com.genericutility.crm.BaseClass;

public class Practice3 extends BaseClass{

	
	public static void main(String[] args) {
		String s1 = "KALLl!@$%@8998ESHA";
		
		int sum = 0;
		
		for(int i = 0; i<s1.length()-1;i++) {
		
		if(s1.charAt(i)>= '0' && s1.charAt(i)<='9') {
		sum+= s1.charAt(i)-48;
		}
		}
		System.out.println(sum);
		
	}	
}

