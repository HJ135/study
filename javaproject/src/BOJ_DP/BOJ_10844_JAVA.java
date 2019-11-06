package BOJ_DP;

import java.util.*;

public class BOJ_10844_JAVA { //쉬운 계단 수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		long count[][] = new long[11][N+1];
		long result = 0;

		for (int i = 1 ; i < 10 ; i ++) count[i][1] = 1;

		for(int j =2  ; j < N+1 ; j ++) {
			count[0][j] = count[1][j-1];
			count[9][j] = count[8][j-1];
			for(int i = 1 ; i < 9 ; i ++)
				 count[i][j] = (count[i-1][j-1] + count[i+1][j-1])%1000000000;
		}


		for(int i = 0 ; i <10 ; i ++) result += count[i][N];

		System.out.println(result%1000000000);

		scan.close();
	}


}
