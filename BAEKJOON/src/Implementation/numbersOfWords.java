package Implementation;

import java.util.Scanner;

public class numbersOfWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str; // 공백의 개수
        int cnt = 0; // 단어의 개수

        System.out.println("원하는 단어들를 Space Bar를 이용해 나열해보세요.");
        str = sc.nextLine();

        for(int j = 0; j < str.length(); j++) {
            if(str.charAt(j) == ' ') { // space bar를 이용해 단어 사이에 빈칸이 생길 경우
                cnt++; // 단어의 개수 증가
            }
        }

        if(str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' ') { // 첫 번째와 마지막이 공백이 아닌 경우
            cnt = cnt + 1;
        }
        if(str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ') { // 첫 번째와 마지막이 공백인 경우
            cnt = cnt - 1;
        }
        System.out.println("당신이 입력한 단어의 개수는 " + cnt + "개 입니다.");
    }
}