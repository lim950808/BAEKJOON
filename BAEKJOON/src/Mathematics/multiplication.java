package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//곱셈
public class multiplication {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		String S = String.valueOf(B);
		//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어짐
		for(int i=2; i>=0; i--) {
			//1의 자리수 부터 뽑아내서 연산
			//숫자 char형을 정수화 시키기 위해 '0' 빼기
			System.out.println((S.charAt(i) - '0') * A);
		}
		//첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력
		System.out.println(A * B);
		
	}

}