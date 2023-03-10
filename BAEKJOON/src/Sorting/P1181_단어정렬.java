package Sorting;

import java.util.*;

public class P1181_단어정렬 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String arr[]  = new String[N];
        sc.nextLine();
        //13
        //but
        //i
        //wont
        //hesitate
        //no
        //more
        //no
        //more
        //it
        //cannot
        //wait
        //im
        //yours

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        // Array.sort(arr, new Comparator <T>)는 인자를 2개를 받고 위의 문제에서는 기존의 규칙이 아닌 새로운 규칙으로 정렬을 해야 하므로 @overide (오버라이딩)을 통해 Comparator에 있는 메서드인 compare를 재정의
        Arrays.sort(arr,new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 두 문자열 길이가 다르다면 오름차순으로 문자열을 정렬하고, 두 문자열의 길이가 같다면 사전 순으로 정렬
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        // 이전 문자열과 비교하면서 중복이라면 continue로 넘어가면서 문자열들을 출력
        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            if (arr[i].equals(arr[i-1])) continue;
            System.out.println(arr[i]);
            //i
            //im
            //it
            //no
            //but
            //more
            //wait
            //wont
            //yours
            //cannot
            //hesitate
        }
    }
}