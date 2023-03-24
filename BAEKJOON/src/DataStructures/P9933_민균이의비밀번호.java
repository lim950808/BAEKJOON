package DataStructures;

import java.util.*;

public class P9933_민균이의비밀번호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            //4
            //las
            //god
            //psala
            //sal
            String reversed = new StringBuffer(str).reverse().toString();

            if (list.contains(reversed) || str.equals(reversed)) {
                System.out.println(str.length() + " " + str.charAt(str.length() / 2)); // 3 a
                return;
            } else {
                list.add(str);
            }
        }
    }
}