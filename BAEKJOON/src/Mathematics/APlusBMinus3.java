package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 //A+B-3
public class APlusBMinus3 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		//StringBuilder 에 계산한 식을 넣어준 뒤 나중에 한 번에 출력
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " "); //한 줄에 정수 2개이니 공백을 기준으로 문자열을 분리해주어야 함.
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		//A+B 출력
		System.out.println(sb);
	}
	
}