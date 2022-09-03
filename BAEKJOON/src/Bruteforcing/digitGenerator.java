package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//분해합: 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미
public class digitGenerator {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0; i<N; ++i) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num = num / 10;
			}
			
			if(sum+i == N) {
				result = i; //생성자가 없는 경우에는 0을 출력
				break;
			}
		}
		//자연수 N이 주어졌을 때, N의 가장 작은 생성자를 출력
		System.out.println(result);
		
	}

}