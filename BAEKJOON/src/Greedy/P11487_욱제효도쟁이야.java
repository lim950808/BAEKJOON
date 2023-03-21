package Greedy;

import java.io.*;
import java.util.*;

// 모든 마을을 관광하기 위해 필요한 최소 이동비용을 출력
public class P11487_욱제효도쟁이야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄에 마을의 수 n
        int n = Integer.parseInt(br.readLine()); // 5

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int max = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken()); // 1 6 5 2 4
            sum += num;
            max = Math.max(max, num);
        }

        sum -= max;
        System.out.print(sum);
    }
}