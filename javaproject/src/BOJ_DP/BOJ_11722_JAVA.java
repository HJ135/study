package BOJ_DP;

import java.util.*;

public class BOJ_11722_JAVA {//백준 11722 가장 긴 감소하는 부분 수열 java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scin = new Scanner(System.in);
		int size = scin.nextInt();
		int max = 0;
		int[] arr = new int[size+1]; //배열을 표준입력한다.
		int[] dynamic = new int[size+1]; 

		for(int i = 1 ; i <= size ; i ++) {
			arr[i] = scin.nextInt();
			dynamic[i] = 1;
		}


		for(int i = 1 ; i <= size; i ++)
			for(int j = 1 ; j < i ; j ++)
				if (arr[j] > arr[i] && dynamic[j] >= dynamic[i]) dynamic[i] = dynamic[j]+1 ; 
		//arr[i]가 arr[j]보다 작은데, dynamic[i]가 dynamic[j]보다 작으면 dynamic[i]를 dynamic[j]보다 1 큰 수로 만들어준다.

		for(int i = 0 ; i <= size ; i ++ ) if (max < dynamic[i]) max = dynamic[i]; //dynamic중에서 가장 큰 것을 max로 둔다.
		
		System.out.println(max);

		scin.close();
	}

}
