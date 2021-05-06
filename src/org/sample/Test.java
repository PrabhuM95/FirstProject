package org.sample;

public class Test {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[4]=50;
		a[0]=20;
		a[3]=30;
		a[1]=50;
		a[2]=10;
		
		int b=a.length;
		System.out.println(b);
		
		System.out.println(a[3]);
		System.out.println("Print based on index");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("Print based on values");
		for (int x : a) {
			System.out.println(x);
			
		}
		
		
		
		
	}

}
