package Implementation;

import java.util.Scanner;
//별 찍기 - 4
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
            //첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개 출력
            //첫째 줄부터 N번째 줄까지 차례대로 별을 출력
            System.out.println();
        }
        
    }
    
}