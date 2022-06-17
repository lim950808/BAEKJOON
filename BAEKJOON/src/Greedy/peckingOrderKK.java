package Greedy;
//한조서열정리하고옴ㅋㅋ
import java.util.Scanner;

public class peckingOrderKK {

    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //봉우리의 수 겸 활잡이의 수 N
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) { // 자신보다 높은 봉우리면 공격
                    count++;
                } else { // 자신보다 낮은 봉우리면 포기하고 드러누워 낮잠
                    break;
                }
            }
            answer = Math.max(answer, count); //최고의 활잡이가 처치할 수 있는 적의 최대 숫자
        }
        
        System.out.println(answer);
        
    }
    
}