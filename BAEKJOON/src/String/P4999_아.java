package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4999_아 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("재환이가 가장 길게 낼 수 있는 aaah 입력 : ");
        String jaeHwan = bf.readLine();

        System.out.println("의사가 듣기를 원하는 aah 입력 : ");
        String doctor = bf.readLine();

        System.out.println("재환이가 그 병원에 가야하면 go를, 아니면 no를 출력 : ");
        if (jaeHwan.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
