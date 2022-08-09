package Greedy;
//보물
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
public class treasure {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); // A의 오름차순 정렬
 
        Integer[] B = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(B, Comparator.reverseOrder()); // B의 내림차순 정렬
 
        int answer = 0;
        for (int i = 0; i < N; i++) { // A의 가장 작은 값과 B의 가장 큰 값을 곱해서 더해 나감(+=)
        	answer += A[i] * B[i];
        }
 
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}