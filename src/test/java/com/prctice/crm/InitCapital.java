package com.prctice.crm;

public class InitCapital {

	public static void main(String[] args) {
		String s="my name is kallesha";
		String[] sa=s.split(" ");
		
		for(String ele:sa) {
			System.out.print(ele.substring(0, 1).toUpperCase().concat(ele.substring(1))+" ");
		}
	}
}
