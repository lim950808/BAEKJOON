package Greedy;
//�������������ϰ�Ȥ���
import java.util.Scanner;

public class peckingOrderKK {

    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //���츮�� �� �� Ȱ������ �� N
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) { // �ڽź��� ���� ���츮�� ����
                    count++;
                } else { // �ڽź��� ���� ���츮�� �����ϰ� �巯���� ����
                    break;
                }
            }
            answer = Math.max(answer, count); //�ְ��� Ȱ���̰� óġ�� �� �ִ� ���� �ִ� ����
        }
        
        System.out.println(answer);
        
    }
    
}