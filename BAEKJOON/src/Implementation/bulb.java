import java.util.*;
import java.lang.*;
import java.io.*;
// 전구_21918
// 명령어가 들어오는 순서대로 반복문을 이용해서 전구의 상태를 변경
public class bulb {
    static int []bulb;
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        int N = rd.nextInt(); // 전구의 갯수 N
        int M = rd.nextInt(); // 입력되는 명령어의 갯수 M

        bulb = new int[N + 1];

        // 1은 전구가 켜져 있는 상태 (on)
        for(int i=1; i<=N; i++) {
            bulb[i] = rd.nextInt();
        }

        // 0은 전구가 꺼져 있는 상태 (off)
        for(int i=0; i<M; i++) {
            int command = rd.nextInt();
            int first   = rd.nextInt(); // 첫 번째 줄에 전구의 개수 N와 입력되는 명령어의 개수 M이 주어진다.
            int second  = rd.nextInt(); // 두 번째 줄에는 N개의 전구가 현재 어떤 상태 s인지 주어진다. (0은 꺼져있는 상태, 1은 켜져있는 상태)
            if(command == 1) { // 1번 명령어: i번째 전구의 상태를 x로 변경
                bulb[first] = second;
            }
            else if(command == 2) { // 2번 명령어: l번째부터 r번째까지의 전구의 상태를 변경한다. (켜져있는 전구는 끄고, 꺼져있는 전구는 킨다.)
                for(int j=first; j<=second; j++)
                    bulb[j] ^= 1; // bulb[j] = 1 - bulb[j];
            }
            else if(command == 3) { // 3번 명령어: l번째부터 r번째까지의 전구를 끈다.
                for(int j=first; j<=second; j++)
                    bulb[j] &= 0; // bulb[j] = bulb[j] & 0
            }
            else { // 4번 명령어: l번째부터 r번째까지의 전구를 킨다.
                for(int j=first; j<=second; j++)
                    bulb[j] |= 1; // bulb[j] = bulb[j] | 1
            }
        }

        StringBuilder out = new StringBuilder();
        for(int i=1; i<=N; i++) {
            out.append(bulb[i] + " ");
        }

        System.out.println(out); // 모든 명령어를 수행한 후 전구가 어떤 상태인지 출력
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}