package Mathematics;

import java.util.Scanner;

public class P13223_소금폭탄 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("현재 시각이 hh:mm:ss로 주어진다. 시간의 경우 0≤h≤23 이며, 분과 초는 각각 0≤m≤59, 0≤s≤59 이다.");
        String[] current = sc.next().split(":");

        System.out.println("소금 투하의 시간이 hh:mm:ss로 주어진다.");
        String[] target = sc.next().split(":");

        int currentHour = Integer.parseInt(current[0]);
        int currentMinute = Integer.parseInt(current[1]);
        int currentSecond = Integer.parseInt(current[2]);

        int targetHour = Integer.parseInt(target[0]);
        int targetMinute = Integer.parseInt(target[1]);
        int targetSecond = Integer.parseInt(target[2]);

        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;
        int targetSecondAmount = targetHour * 3600 + targetMinute * 60 + targetSecond;

        int NeedSecondAmount = targetSecondAmount - currentSecondAmount;

        if (NeedSecondAmount <= 0) {
            NeedSecondAmount += 24 * 3600;
        }

        int needHour = NeedSecondAmount / 3600;
        int needMinute = (NeedSecondAmount % 3600) / 60;
        int needSecond = NeedSecondAmount % 60;

        System.out.println("로봇팔이 소금을 투하할때까지 필요한 시간을 hh:mm:ss로 출력한다.");
        System.out.println(String.format("%02d:%02d:%02d", needHour, needMinute, needSecond));
    }
}
