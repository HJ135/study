package BOJ_DP;

import java.util.*;

public class BOJ_2293_JAVA {

	public static void main(String[] args) {

		int n, k; //�迭�� size�� �޴´�.
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		k = scan.nextInt();

		int arr[][] = new int [n+1][k+1];

		int ary[] = new int[n+1];
		for(int i = 1 ; i <= n ; i ++) ary[i] = scan.nextInt();
		Arrays.sort(ary); //���ڰ� ������������ ������ ���� �� ������ �ѹ� sort ���ش�.


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

		System.out.println(arr[n][k]); // ����

		scan.close(); // scan �ݱ�
	}
}