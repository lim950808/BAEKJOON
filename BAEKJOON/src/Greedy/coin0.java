package Greedy;
//���� 0

//��� 1 : [Scanner + StringBuilder]
//import java.util.Scanner;
//
//public class coin0 {
// 
//	public static void main(String[] args) {
// 
//		Scanner in = new Scanner(System.in);
//		
//		int N = in.nextInt();
//		int K = in.nextInt();
//		
//		int[] coin = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			coin[i] = in.nextInt();
//		}
//		
//		int count = 0;
// 
//		for(int i = N - 1; i >= 0; i--) {
// 
//			// ���� ������ ��ġ�� K���� �۰ų� ���ƾ��� ���������ϴ�.
//			if(coin[i] <= K) {
//				// ���� ��ġ�� �������� ������ �� �ִ� ������ �����ش�.
//				count += (K / coin[i]);
//				K = K % coin[i];
//			}
//		}
//		System.out.println(count);
//	}
// 
//}

//��� 2 : [BufferedReader + StringBuilder] => �� ����
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class coin0 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
 
		for(int i = N - 1; i >= 0; i--) {
 
			// ���� ������ ��ġ�� K���� �۰ų� ���ƾ��� ���������ϴ�.
			if(coin[i] <= K) {
				// ���� ��ġ�� �������� ������ �� �ִ� ������ �����ش�.
				count += (K / coin[i]);
				K = K % coin[i];
			}
		}
		System.out.println(count);
	}
 
}