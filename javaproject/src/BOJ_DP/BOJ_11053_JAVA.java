package BOJ_DP;
import java.util.*;

public class BOJ_11053_JAVA {//���� 11053 ���� �� �����ϴ� �κм��� java
	
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int size = scin.nextInt();

		int arr[]= new int[size];
		int dynamic[]= new int[size];
		int max = 1;

		for(int i = 0 ; i < size ; i ++) {
			arr[i] = scin.nextInt();
			dynamic[i] = 1; // �ϳ��� ������ 1�̹Ƿ� 1�� �ʱ�ȭ �Ѵ�.
		}

		for(int i=0; i<size ; i++)
			for(int j=0 ; j<=i ; j++) if(arr[j]<arr[i] && dynamic[j]>=dynamic[i]) dynamic[i]=dynamic[j]+1;
		

		for(int i=0; i<size ; i++) if(dynamic[i]>max) max = dynamic[i];

		System.out.println(max);

	}
}
