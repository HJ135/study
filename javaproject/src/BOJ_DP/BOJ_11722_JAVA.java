package BOJ_DP;

import java.util.*;

public class BOJ_11722_JAVA {//���� 11722 ���� �� �����ϴ� �κ� ���� java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scin = new Scanner(System.in);
		int size = scin.nextInt();
		int max = 0;
		int[] arr = new int[size+1]; //�迭�� ǥ���Է��Ѵ�.
		int[] dynamic = new int[size+1]; 

		for(int i = 1 ; i <= size ; i ++) {
			arr[i] = scin.nextInt();
			dynamic[i] = 1;
		}


		for(int i = 1 ; i <= size; i ++)
			for(int j = 1 ; j < i ; j ++)
				if (arr[j] > arr[i] && dynamic[j] >= dynamic[i]) dynamic[i] = dynamic[j]+1 ; 
		//arr[i]�� arr[j]���� ������, dynamic[i]�� dynamic[j]���� ������ dynamic[i]�� dynamic[j]���� 1 ū ���� ������ش�.

		for(int i = 0 ; i <= size ; i ++ ) if (max < dynamic[i]) max = dynamic[i]; //dynamic�߿��� ���� ū ���� max�� �д�.
		
		System.out.println(max);

		scin.close();
	}

}
