package Greedy;
//ÄÅÈ¦´õ
import java.io.*;

public class cupHolder {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // ÁÂ¼® ¼ö
		String seat = br.readLine(); // ÁÂ¼® Á¤º¸
		
		int couple = 0; // Ä¿ÇÃ ¼ö
		for (int i = 0; i < seat.length(); i++) {
			if (seat.charAt(i) == 'L') {
				couple++;
				i++;
			}
		}
		
		if (couple == 0)	
            System.out.println(N);
		else
			System.out.println(N - couple + 1);
	}
	
}