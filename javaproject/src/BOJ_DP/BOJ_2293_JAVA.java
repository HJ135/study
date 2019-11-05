package BOJ_DP;

import java.util.*;

public class BOJ_2293_JAVA {

	public static void main(String[] args) {

		int n, k; //배열의 size를 받는다.
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		k = scan.nextInt();

		int arr[][] = new int [n+1][k+1];

		int ary[] = new int[n+1];
		for(int i = 1 ; i <= n ; i ++) ary[i] = scan.nextInt();
		Arrays.sort(ary); //숫자가 오름차순으로 들어오지 않을 수 있으니 한번 sort 해준다.


		for(int i = 1 ; i <= n ; i ++) {
			arr[i][0] = ary[i];
			for(int j = 1 ; j <= k ; j ++) {
				if (i == 1 && j >= arr[i][0] && j % arr[i][0] == 0 ) arr[i][j] ++;
				else if (j < arr[i][0]) arr[i][j] = arr[i-1][j]; 
				else if (j == arr[i][0]) arr[i][j] = arr[i-1][j]+1;
				else if (j > arr[i][0]) arr[i][j] = arr[i-1][j] + arr[i][j-arr[i][0]];
			}
		}

		/*
		for(int i = 0 ; i <= n ; i ++)
			for(int j = 0 ; j <= k ; j ++) {
				System.out.print(arr[i][j] + " ");
				if (j == k) System.out.println();
			}*/

		System.out.println(arr[n][k]); // 정답

		scan.close(); // scan 닫기
	}
}