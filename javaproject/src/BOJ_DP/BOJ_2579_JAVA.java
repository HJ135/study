package BOJ_DP;

import java.util.Scanner;

public class BOJ_2579_JAVA { //백준 2579번 계단 오르기 java
	
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int size = scin.nextInt();

		int[] arr = new int[size+1]; 
		int[] dynamic = new int[size+1]; 

		for(int i = 1 ; i <= size ; i ++) {
			arr[i] = scin.nextInt(); //배열을 표준입력한다.
			dynamic[i] = arr[i]; //dynamic 배열은 arr와 같은값으로 초기화한다. 최대값은 아무리 작아도 arr에 있는 가장 큰 수가 된다.
		}

		int max = arr[1]; //최대값은 arr의 처음 값으로 초기화 한다.
		if (size > 1) dynamic[2] = dynamic[1]+dynamic[2];
		for(int i = 3 ; i <= size; i ++) {
			dynamic[i] = Math.max(dynamic[i-3]+arr[i-1]+arr[i], dynamic[i-2]+arr[i]);
		}
		max = dynamic[size];
		System.out.println(max);
		
		/*
		for(int i = 0 ; i <= size ; i ++) System.out.print(arr[i]+" ");
		System.out.println();
		for(int i = 0 ; i <= size ; i ++) System.out.print(dynamic[i]+" ");
		*/
		
		scin.close();
	}//main 끝
}
