package Implementation;

import java.io.*;
//별 찍기 - 5
public class star5 {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N-i; j++) {
                sb.append(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        //첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개 출력
        //별은 가운데를 기준으로 대칭
        //첫째 줄부터 N번째 줄까지 차례대로 별을 출력
        System.out.print(sb);
        
    }
    
}