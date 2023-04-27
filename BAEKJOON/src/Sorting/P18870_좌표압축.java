package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;


public class P18870_좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 5
        int[] a = new int[N];
        int[] b = new int[N];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 2 4 -10 4 -9
        for (int i = 0; i < N; i++) {
            b[i] = a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(b);

        int c = 0;
        for (int v : b) {
            if (!map.containsKey(v)) {
                map.put(v, c);
                c++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int e : a) {
            int d = map.get(e);
            sb.append(d).append(' ');
        }

        System.out.println(sb); // 2 3 0 3 1
    }
}
