package BOJ_DP;

import java.util.Scanner;

public class BOJ_2579_JAVA { //���� 2579�� ��� ������ java
	
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int size = scin.nextInt();

		int[] arr = new int[size+1]; 
		int[] dynamic = new int[size+1]; 

		for(int i = 1 ; i <= size ; i ++) {
			arr[i] = scin.nextInt(); //�迭�� ǥ���Է��Ѵ�.
			dynamic[i] = arr[i]; //dynamic �迭�� arr�� ���������� �ʱ�ȭ�Ѵ�. �ִ밪�� �ƹ��� �۾Ƶ� arr�� �ִ� ���� ū ���� �ȴ�.
		}

		int max = arr[1]; //�ִ밪�� arr�� ó�� ������ �ʱ�ȭ �Ѵ�.
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
	}//main ��
}
