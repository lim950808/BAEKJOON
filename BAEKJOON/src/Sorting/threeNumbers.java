package Sorting;

import java.util.*;
//�� ��
public class threeNumbers {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int [] a = new int [3]; //�� ���� A[0], B[1], C[2]

        for (int i=0; i<3; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        System.out.print(a[1]); //�� ��°�� ū ������ ���
        
    }
    
}