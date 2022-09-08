package Mathematics;

import java.util.Scanner;
//합
public class sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
      //sum 변수를 선언
		int sum = 0;
      
      //for문으로 1부터 n까지 더한 뒤 출력
		for (int i=1; i<=n; ++i) {
			sum += i;
		}
      
      //n이 주어졌을 때, 1부터 n까지 합을 출력
		System.out.println(sum);
	}
  
}