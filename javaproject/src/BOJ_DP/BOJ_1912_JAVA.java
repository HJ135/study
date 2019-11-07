package BOJ_DP;

import java.util.Scanner;

public class BOJ_1912_JAVA { //백준 1912번 연속합 java
	
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
		
		for(int i = 1 ; i <= size; i ++) {
			dynamic[i] = Math.max(dynamic[i-1] + arr[i], arr[i]); 
			//배열의 i까지의 최대값을 구하고 그것을 dynamic[i]에 저장한다. 이전까지 구한 최대값인 dynamic[i-1] arr[i]를 더한 값과, arr[i]를 비교한다.
			//만약 arr[i]가 더 크다면, (예를들어, i 이전까지 모두 음수였는데, i가 양수라면 arr[i]가 최대값이 된다.) 그것을 dynamic[i]에 넣고, 그렇지 않으면  dyanmic[i-1]+arr[i]를 넣는다.

			if(max < dynamic[i]) max = dynamic[i]; //dynamic[i]중 가장 큰 값을 max로 둔다.
		}

		System.out.println(max);

		scin.close();
	}//main 끝
}//class 끝
