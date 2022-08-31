package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//윤년
public class leapYear {
 
	public static void main(String[] args) throws IOException {
        
        //BufferedReader은 문자열 형태(String)로 저장됨.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //이를 정수로 쓰기위해 Integer.parseInt()로 형 변환.
		int x = Integer.parseInt(br.readLine());
		
        //윤년이면 1, 아니면 0을 보여주는 삼항연산자
		System.out.print(
            //4의 배수는 윤년으로 1을 출력하지만, 100의 배수일 경우 윤년이 아니라 0을 출력.
            //다만, 400의 배수일 경우는 윤년으로 봄.
            //먼저 4의 배수인지 여부를 본 뒤 4의 배수일 경우 400으로 나뉘어 떨어지는지, 100으로 나뉘어 떨어지는지 여부를 검사.
            (x%4==0) ? ((x%400==0) ? "1" : (x%100==0) ? "0" : "1") : "0"
        );
		
	}
    
}