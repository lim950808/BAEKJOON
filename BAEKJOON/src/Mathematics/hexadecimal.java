package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//16진수
public class hexadecimal {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine(), 16); //16진수를 10진수로 변환
        System.out.println(A); //10 출력
        
    }
    
}