package Mathematics;

import java.io.*;
import java.util.*;
//손익분기점
public class breakEvenPoint {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()); //고정 비용
        int b = Integer.parseInt(st.nextToken()); //가변 비용
        int c = Integer.parseInt(st.nextToken()); //판매 비용
        
        if (c - b == 0) {  //분모가 0이면 손익분기점이 존재하지 않으므로 -1 출력
            System.out.print(-1);
            return;
        }
        
        int x = a / (c - b);
        
        //몇 개를 팔아야지 최초로 이익이 발생하는지를 출력
        if (x < 0) {
            System.out.print(-1);
        } else {
            System.out.print(x + 1);
        }
        
    }
    
}