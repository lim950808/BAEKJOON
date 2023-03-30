package Greedy;

import java.io.*;
import java.util.*;

public class P4796_캠핑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int caseNum = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()); // 5 8 20
            int P = Integer.parseInt(st.nextToken()); // 5 8 17
            int V = Integer.parseInt(st.nextToken()); // 0 0 0

            if (L == 0 && P == 0 && V == 0) break;

            int result = (V / P) * L + Math.min(V % P, L);
            sb.append("Case ").append(caseNum).append(": ").append(result).append('\n');
            caseNum += 1;
        }

        System.out.print(sb);
        // Case 1: 14
        // Case 2: 11
    }
}
