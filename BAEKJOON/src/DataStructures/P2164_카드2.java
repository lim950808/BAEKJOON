package DataStructures;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
// 카드2
public class P2164_카드2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> myQueue = new LinkedList<>(); // 카드 저장 자료구조 myQueue
        int N = sc.nextInt(); // 카드의 개수 N

        for (int i = 1; i <= N; i++) { // 카드를 큐에 저장하기
            myQueue.add(i);
        }

        while (myQueue.size() > 1) { // 카드가 1장 남을 때까지
            myQueue.poll(); // poll : 맨 위의 카드를 버림
            myQueue.add(myQueue.poll()); // poll -> add : 맨 위의 카드를 가장 아래 카드 밑으로 이동
        }

        System.out.println(myQueue.poll()); // 마지막으로 남은 카드 출력
    }
}