package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//16����
public class hexadecimal {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine(), 16); //16������ 10������ ��ȯ
        System.out.println(A); //10 ���
        
    }
    
}