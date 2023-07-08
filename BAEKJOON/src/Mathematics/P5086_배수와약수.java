package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P5086_배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String factor = "factor\n";
        String multiple = "multiple\n";
        String neither = "neither\n";

        System.out.println("각 테스트 케이스는 두 자연수로 이루어져 있다. 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.");
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if (first == 0 && second == 0) break;

            if (second % first == 0) {
                sb.append(factor);
            } else if (first % second == 0) {
                sb.append(multiple);
            } else {
                sb.append(neither);
            }
        }

        System.out.println("각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력 : ");
        System.out.println(sb);
    }
}
