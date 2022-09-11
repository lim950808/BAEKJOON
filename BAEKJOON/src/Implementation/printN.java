package Implementation;

import java.io.*;
//N 찍기
class pringN {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); //입력
		
		//1부터 N까지 한 줄에 하나씩 출력
		for(int i=1; i<=N; i++) {
			bw.write(String.valueOf(i)); //출력
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}
	
}