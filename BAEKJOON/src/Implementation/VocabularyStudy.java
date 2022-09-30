package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 단어 공부
public class VocabularyStudy {
    public static void main(String[] args) throws IOException {
        // 중간에 버퍼를 두어 한번에 묶어 보내는 것이 더 효율적이고 빠름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("알파벳 대소문자로 된 단어가 주어지면, 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램");

        // 입력값을 대문자로 바꿔 저장
        String str = br.readLine().toUpperCase();
        // 알파벳 중복개수의 최댓값을 저장할 변수 max
        int max = 0;
        // 중복개수가 최댓값인 알파벳을 저장할 변수 result
        String result = "";

        while(true) {
            // 현재 문자열의 0 인덱스 값을 저장
            String index = String.valueOf(str.charAt(0));
            // 현재 문자열의 길이를 저장할 변수 size
            int size = str.length();
            // 0 인덱스 값을 문자열에서 제외
            str = str.replace(String.valueOf(str.charAt(0)), "");
            // 제외한 후의 문자열의 길이를 담는 변수 newSize
            int newSize = str.length();

            // 중복개수 = (기존 문자열의 길이 - 0 인덱스 값을 제외한 길이)
            // 중복개수가 최댓값과 같으면 result에 알파벳을 더한다.
            if(max == (size - newSize)) {
                result += index;
            }
            // 중복개수가 최댓값보다 크면 최댓값에 중복개수를 저장하고, result에 알파벳을 저장.
            if(max < (size - newSize)) {
                max = (size - newSize);
                result = index;
            }
            // 문자열이 비면 while문 종료
            if(str.equals("")) break;
        }

        if(result.length() == 1) {
            System.out.println(result); // result에 입력된 알파벳이 1개이면 result 출력
        } else {
            System.out.println("?"); // 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
        }
    }
}