package BOJ_DP;

import java.util.Scanner;

public class BOJ_1912_JAVA { //���� 1912�� ������ java
	
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
		
		for(int i = 1 ; i <= size; i ++) {
			dynamic[i] = Math.max(dynamic[i-1] + arr[i], arr[i]); 
			//�迭�� i������ �ִ밪�� ���ϰ� �װ��� dynamic[i]�� �����Ѵ�. �������� ���� �ִ밪�� dynamic[i-1] arr[i]�� ���� ����, arr[i]�� ���Ѵ�.
			//���� arr[i]�� �� ũ�ٸ�, (�������, i �������� ��� �������µ�, i�� ������ arr[i]�� �ִ밪�� �ȴ�.) �װ��� dynamic[i]�� �ְ�, �׷��� ������  dyanmic[i-1]+arr[i]�� �ִ´�.

			if(max < dynamic[i]) max = dynamic[i]; //dynamic[i]�� ���� ū ���� max�� �д�.
		}

		System.out.println(max);

		scin.close();
	}//main ��
}//class ��
