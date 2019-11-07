package BOJ_DP;
import java.util.*;
import java.io.*;

public class BOJ_2193_JAVA { //백준 2193 이친수 java

	public static void main(String args[]) {
		Scanner scin = new Scanner(System.in);
		int size = scin.nextInt();
		
		long[] dynamic = new long[size+1];
		 
		dynamic[1] = 1;
		
        for (int i = 2; i < size+1; i++)
               dynamic[i] = dynamic[i - 2] + dynamic[i - 1];
		
        System.out.println(dynamic[size]);
		
		scin.close();
	}

}
