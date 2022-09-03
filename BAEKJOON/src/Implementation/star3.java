package Implementation;

import java.util.Scanner;
//별 찍기 - 3
public class star3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=N; ++i) {
			for (int j=1; j <= N-i+1; ++j) {
				System.out.print("*");
			}
			//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개 출력
			//첫째 줄부터 N번째 줄까지 차례대로 별을 출력
			System.out.println();
		}
		
	}
	
}