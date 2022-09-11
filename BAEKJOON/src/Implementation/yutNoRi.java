package Implementation;

import java.io.*;
import java.util.*;
//윷놀이
public class yutNoRi {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"D", "C", "B", "A", "E"}; //배열 생성
        StringBuilder sb = new StringBuilder();
        
        //첫째 줄부터 셋째 줄까지 각 줄에 각각 한 번 던진 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가 빈칸을 사이에 두고 주어진다.
        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken()); //수의 합이 바로 이 배열의 인덱스가 된다.
            }
            sb.append(arr[sum] + "\n");
        }
        
        //도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E로 출력
        System.out.print(sb);
        
    }
    
}