package Implementation;

import java.util.Scanner;
//�� ��� - 4
public class star4 {  
	
    public static void main(String args[]) {
    	
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i=0; i<N; i++) {
            for(int j=0; j<i; j++) {
               System.out.printf(" "); 
            }
            for(int p=0; p<N-i; p++) {
                System.out.printf("*");
            }
            //ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1�� ���
            //ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ���
            System.out.println();
        }
        
    }
    
}