package Sorting;

import java.util.*;
//세 수
public class threeNumbers {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int [] a = new int [3]; //세 정수 A[0], B[1], C[2]

        for (int i=0; i<3; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        System.out.print(a[1]); //두 번째로 큰 정수를 출력
        
    }
    
}