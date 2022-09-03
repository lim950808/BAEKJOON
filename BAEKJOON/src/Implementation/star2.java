package Implementation;

import java.util.Scanner;
//별 찍기 - 2
public class star2 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=N; ++i) {
			for (int j=1; j <= N-i; ++j) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; ++j) {
				System.out.print("*");
			}
			//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개 출력
			//오른쪽을 기준으로 정렬
			System.out.println();
		}
        
	}
	
}