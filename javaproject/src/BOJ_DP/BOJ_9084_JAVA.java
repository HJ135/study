package BOJ_DP;

import java.util.Scanner;

public class BOJ_9084_JAVA { //백준 9084 동전 java 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testCase;
		int n;
		int [] coin;
		int cost;
		int answer;
		
		testCase = scan.nextInt();
		while(testCase-- > 0) {
			n = scan.nextInt();
			coin = new int[n];
			for(int i = 0 ; i < n ; i ++) coin[i] = scan.nextInt(); //동전 종류를 받는다.
			cost = scan.nextInt();
			
			int[] dynamic = new int[cost+1];
			dynamic[0] = 1;
			for(int j = 0 ; j < n ; j ++)
				for(int k = coin[j] ; k <cost+1 ; k++)
					dynamic[k] = dynamic[k] + dynamic[k-coin[j]];
			answer = dynamic[cost];
			System.out.println(answer);
		}

	}
}
