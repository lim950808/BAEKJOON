package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P18108_1998년생인내가태국에서는2541년생 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // 2541
        int year = Integer.parseInt(str);

        System.out.println(year - 543); // 1998
    }
}
