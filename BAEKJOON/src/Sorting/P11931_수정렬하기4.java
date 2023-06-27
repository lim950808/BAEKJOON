package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P11931_수정렬하기4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("정수 N 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        Integer arr[] = new Integer[N];

        System.out.println(N + "개의 정수 입력 : ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(N + "개의 수를 내림차순으로 정렬한 결과를 한 줄에 하나씩 출력 : ");
        for (Integer i : arr)
            bw.write(i + "\n");

        bw.flush();
    }
}
