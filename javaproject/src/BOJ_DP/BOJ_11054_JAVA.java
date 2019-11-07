package BOJ_DP;

import java.util.Scanner;

public class BOJ_11054_JAVA { //백준 11054번 가장 긴 바이토닉 부분 수열 java
	
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int size = scin.nextInt();

		int[] arr = new int[size+1];
		int[] dym1 = new int[size+1];
		int[] dym2 = new int[size+1];
		int max = 0;
		
		for(int i = 1 ; i <= size ; i ++) {
			/*
			 * 기본아이디어 : arr[1]부터 arr[i]까지의 증가하는 부분수열의 최대 길이를 dym1[i]에 저장한다.
			 * 반대로 ary[i]부터 ary[size]까지의 증가하는 감소수열의 최대 길이를 dym2[i]에 저장한다.
			 * 그 후, dym1[i]와 dym2[i]의 합 중에서, (가장 큰 값-1)을 max로 반환한다. -> -1하는 이유는 arr[i]를 두 번 세기 때문이다.
			 */
			 
			arr[i] = scin.nextInt();
			dym1[i] = 1;
			dym2[i] = 1;
		}

		if (size == 1) System.out.println(1); //arr의 길이가 1이면 뭐가 들어오더라도 길이가 1이므로 그냥 1을 반환한다.
		else {
			for(int i = 1 ; i <= size ; i ++) 
				for(int j = 1 ; j <= i ; j ++) if (arr[i] > arr[j] && dym1[i] <= dym1[j] ) dym1[i] = dym1[j]+1;

			for(int i = size ; i >= 1 ; i --)
				for(int j = size ; j >= i; j-- )
					if( arr[i] > arr[j] && dym2[i] < dym2[j]+1) dym2[i] = dym2[j]+1;
				

			for(int i = 0 ; i <= size ; i ++)
			if (max < dym1[i] + dym2[i] -1) max = dym1[i]+dym2[i]-1;

			
			System.out.println(max);
		}
		
	}
}
