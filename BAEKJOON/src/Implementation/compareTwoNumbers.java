package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//두 수 비교하기
public class compareTwoNumbers {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A > B) {
			System.out.println(">"); //A가 B보다 큰 경우에는 '>'를 출력
		}else if (A < B) {
			System.out.println("<"); //A가 B보다 작은 경우에는 '<'를 출력
		}else {
			System.out.println("=="); //A와 B가 같은 경우에는 '=='를 출력
		}
		
	}

}