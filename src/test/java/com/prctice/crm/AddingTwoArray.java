package com.prctice.crm;

public class AddingTwoArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7,8, 9}, b = { 1, 2, 3, 4, 5, 6, 7 };
		int count = a.length;
		if (count < b.length)
		count = b.length;
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(a[i] + b[i]);
			} catch (Exception e) {
				if (a.length > b.length)
					System.out.println(a[i]);
				else
					System.out.println(b[i]);
			}
		}
	}
}
/*
 

********** ASSIGNMENT **********
input ==> int[] a= {1,0,2,0,3,0,4,0,5,0};
output ==> int[] a= {1,2,3,4,5,0,0,0,0,0};
*/