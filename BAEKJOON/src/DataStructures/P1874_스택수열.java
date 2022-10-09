import java.util.Scanner;
import java.util.Stack;
// 스택 수열
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수열 개수
        int[]A = new int[N]; // 수열 배열

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();

        int num = 1; // 오름차순 수
        boolean result = true;

        for (int i = 0; i < A.length; i++) {
            int su = A[i]; // 현재 수열의 수
            if (su >= num) { //현재 수열 값 >= 오름차순 자연수 : 값이 같아 질 때까지 push()수행
                while (su >= num) { // push()
                    stack.push(num++);
                    bf.append("+\n"); // push 연산은 +로 표현
                }
                stack.pop();
                bf.append("-\n"); // pop 연산은 -로 표현
            }
            else {  //현재 수열 값 < 오름차순 자연수: pop()을 수행하여 수열 원소를 꺼냅니다
                int n = stack.pop();
                // 스택의 가장 위의 수가 만들어야 하는 수열의 수 보다 크다면 수열 출력 불가능
                if (n > su) {
                    System.out.println("NO"); // 불가능한 경우 NO를 출력
                    result = false;
                    break;
                } //
                else {
                    bf.append("-\n"); // pop 연산은 -로 표현
                }
            }
        }
        // -값을 출력한 적이 없으면 저장한 값 출력
        if (result) System.out.println(bf.toString());
    }
}