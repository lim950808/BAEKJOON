package Greedy;
//���� ����
import java.util.*;

public class milkFestival {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // ���� ���� ��
		int[] line = new int[N]; // ���� ���� �� ��ŭ �迭 ����
		int count = 0; // �ִ� ������ �ִ� ���� ����
		int next = 0; // �������� ���� �� �ִ� ���� ����
		
		// ó������ ������ �ִ� ������ ��������̹Ƿ� 0���� �ʱ�ȭ�س���
		for (int i = 0; i < line.length; i++) {
			line[i] = scanner.nextInt();// ���Ը��� �Ĵ� ���� ���� �Է� 0=������� 1=���ڿ��� 2=�ٳ�������
		}

		for (int i = 0; i < line.length; i++) { //0���Կ� �鸣�� ������  1���Ը� �鸦�� ������ ���� �� �ִ�.
			if (line[i] == next && next == 0) {
				count++;
				next = 1;
				continue;
			}
			if (line[i] == next && next == 1) { //2���Ը� �鸣�� ������  0���Ը� �鸦�� ������ ���� �� �ִ�.
				count++;
				next = 2;
				continue;
			}
			if (line[i] == next && next == 2) { //2���Ը� �鸣�� ������  0���Ը� �鸦�� ������ ���� �� �ִ�.
				count++;
				next = 0;
				continue;
			}
		}
		
		System.out.println(count); //���� �� �ִ� ������ �ִ� ����
	}
	
}