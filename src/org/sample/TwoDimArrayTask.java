package org.sample;

public class TwoDimArrayTask {
	public static void main(String[] args) {
		int a[][]=new int [2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		System.out.println(a[1][1]);
System.out.println("all values");

for (int i = 0; i < 2; i++) {
	for (int j = 0; j < 3; j++) {
		System.out.println(a[i][j]+" ");
		
	}
	System.out.println();
	
}
		
	}

}
