package BOJ_DP;

import java.util.Scanner;

public class BOJ_11054_JAVA { //���� 11054�� ���� �� ������� �κ� ���� java
	
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int size = scin.nextInt();

		int[] arr = new int[size+1];
		int[] dym1 = new int[size+1];
		int[] dym2 = new int[size+1];
		int max = 0;
		
		for(int i = 1 ; i <= size ; i ++) {
			/*
			 * �⺻���̵�� : arr[1]���� arr[i]������ �����ϴ� �κм����� �ִ� ���̸� dym1[i]�� �����Ѵ�.
			 * �ݴ�� ary[i]���� ary[size]������ �����ϴ� ���Ҽ����� �ִ� ���̸� dym2[i]�� �����Ѵ�.
			 * �� ��, dym1[i]�� dym2[i]�� �� �߿���, (���� ū ��-1)�� max�� ��ȯ�Ѵ�. -> -1�ϴ� ������ arr[i]�� �� �� ���� �����̴�.
			 */
			 
			arr[i] = scin.nextInt();
			dym1[i] = 1;
			dym2[i] = 1;
		}

		if (size == 1) System.out.println(1); //arr�� ���̰� 1�̸� ���� �������� ���̰� 1�̹Ƿ� �׳� 1�� ��ȯ�Ѵ�.
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
