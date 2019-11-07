package BOJ_DP;

import java.util.Scanner;

public class BOJ_9461_JAVA {//백준 9461번 파도반 수열 java
	
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int testCase = scin.nextInt();

		long [] arr = new long[101];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		
		for(int i = 5 ; i < 101 ; i ++) arr[i] = arr[i-1] + arr[i-5];

		while(testCase-->0) {
			int x = scin.nextInt();
			System.out.println(arr[x]);
		}

	}
}
