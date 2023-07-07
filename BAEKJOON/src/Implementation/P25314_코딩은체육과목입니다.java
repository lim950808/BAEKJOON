package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314_코딩은체육과목입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수의 바이트 크기 N : ");
        int N = Integer.parseInt(br.readLine());

        int answer = N / 4;

        System.out.println(N + "바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력 : ");
        System.out.println("long ".repeat(answer) + "int");
    }
}
