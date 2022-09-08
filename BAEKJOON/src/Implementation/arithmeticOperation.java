package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 //사칙연산
public class arithmeticOperation {
 
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        ////br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눈 뒤, String 배열에 각각 저장.
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]); //배열에 저장된 원소들은 String 이기 때문에 반드시 int형으로 변환해줘야 함.
		int B = Integer.parseInt(str[1]);
		
		System.out.println(A+B); //첫째 줄에 A+B
		System.out.println(A-B); //둘째 줄에 A-B
		System.out.println(A*B); //셋째 줄에 A*B
		System.out.println(A/B); //넷째 줄에 A/B(몫)
		System.out.println(A%B); //다섯째 줄에 A%B(나머지)를 출력
 
	}
 
}