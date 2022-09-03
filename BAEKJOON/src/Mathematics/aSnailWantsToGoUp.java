package Mathematics;

import java.util.*;
import java.io.*;
//달팽이는 올라가고 싶다
public class aSnailWantsToGoUp {
    public static void main(String args[]) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken()); //낮에 올라갈 수 있는 높이
        int B = Integer.parseInt(st.nextToken()); //밤에 자는 동안 아래로 미끄러지는 높이
        int V = Integer.parseInt(st.nextToken()); //나무 막대 높이
        
        int days = (V-A) / (A-B); // 달팽이가 정상에 오르기 전 날 까지의 날
        if((V-A) % (A-B) != 0) // 달팽이가 하루에 오르는 높이보다 정상까지의 높이가 짧을 때
            days++;
        System.out.println(days+1); // 마지막 날 오른 기록은 계산식에 포함 되어있지 않으므로 출력에 1일을 더함
        
    }
}