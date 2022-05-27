package DataStructures;

//��� 1 : [Scanner + Stack]
import java.util.Scanner;
import java.util.Stack;

public class parenthesis_9012 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.println(solve(in.next())); // nextLine()���� �ȵȴ�.
		}
	}

	public static String solve(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			// ���� ��ȣ�� ��� ���ÿ� �ִ´�.
			if (c == '(') {
				stack.push(c);
			}

			// �Ʒ��� ��� �ݴ� ��ȣ �� �����̴�.

			// ������ ����ִ� ���. ��, �ݴ� ��ȣ�� �Է¹޾����� pop�� ���Ұ� ���� ���
			else if (stack.empty()) {
				return "NO";
			}
			// �� ���� ��� stack ���Ҹ� pop �Ѵ�.
			else {
				stack.pop();
			}
		}

		/*
		 * ��� �˻� ��ġ�� ���ÿ� �ܿ� ��Ұ� ������ ���� ��ȣ�� ���� ���� "NO" ������ ��������� ������ �����̹Ƿ� "YES" �̴�.
		 */

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}

//��� 2 : [BufferedReader + Stack]
/*
 * import java.io.BufferedReader; import java.io.InputStreamReader; import
 * java.io.IOException; import java.util.Stack;
 * 
 * public class parenthesis_9012 {
 * 
 * public static void main(String[] args) throws IOException {
 * 
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * StringBuilder sb = new StringBuilder();
 * 
 * int T = Integer.parseInt(br.readLine());
 * 
 * for(int i = 0; i < T; i++) { sb.append(solve(br.readLine())).append('\n'); }
 * 
 * System.out.println(sb); }
 * 
 * public static String solve(String s) {
 * 
 * Stack<Character> stack = new Stack<>();
 * 
 * for (int i = 0; i < s.length(); i++) {
 * 
 * char c = s.charAt(i);
 * 
 * // ���� ��ȣ�� ��� ���ÿ� �ִ´�. if (c == '(') { stack.push(c); }
 * 
 * // �Ʒ��� ��� �ݴ� ��ȣ �� �����̴�.
 * 
 * // ������ ����ִ� ���. ��, �ݴ� ��ȣ�� �Է¹޾����� pop�� ���Ұ� ���� ��� else if (stack.empty()) {
 * return "NO"; } // �� ���� ��� stack ���Ҹ� pop �Ѵ�. else { stack.pop(); } }
 * 
 * 
 * ��� �˻� ��ġ�� ���ÿ� �ܿ� ��Ұ� ������ ���� ��ȣ�� ���� ���� "NO" ������ ��������� ������ �����̹Ƿ� "YES" �̴�.
 * 
 * 
 * if (stack.empty()) { return "YES"; } else { return "NO"; } } }
 */

//��� 3 : [BufferedReader + count]
/*
 * import java.io.IOException; import java.io.InputStreamReader; import
 * java.io.BufferedReader;
 * 
 * public class parenthesis_9012 { public static void main(String[] args) throws
 * IOException { BufferedReader br = new BufferedReader(new
 * InputStreamReader(System.in)); StringBuilder sb = new StringBuilder();
 * 
 * int T = Integer.parseInt(br.readLine());
 * 
 * while (T-- > 0) { sb.append(solve(br.readLine())).append('\n'); }
 * System.out.println(sb);
 * 
 * }
 * 
 * public static String solve(String s) {
 * 
 * int count = 0;
 * 
 * for (char c : s.toCharArray()) {
 * 
 * // ���� ��ȣ�� ��� ī��Ʈ ���� if (c == '(') { count++; }
 * 
 * // �Ʒ��� ��� �ݴ� ��ȣ �� �����̴�.
 * 
 * // count �� 0�� ���. ��, �ݴ� ��ȣ�� �Է¹޾����� pop�� ���Ұ� ���� ��� else if (count == 0) {
 * return "NO"; } // �� ���� ��� count�� ���ҽ�Ų��. else { count--; } }
 * 
 * 
 * ��� �˻� ��ġ�� �ܿ� ��Ұ� ������(count > 0) ���� ��ȣ�� ���� ���� "NO" ��Ұ� ���������(count = 0) ������
 * �����̹Ƿ� "YES" �̴�.
 * 
 * 
 * if (count == 0) { return "YES"; } else { return "NO"; } } }
 */