package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 
// �� �����ϱ� 2
public class sorting2 {    
    public static void main(String[] args) throws IOException {        
        //���� ����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder sb = new StringBuilder();        
        int N = Integer.parseInt(br.readLine());       
        
        //�Է¹޴� ���� �迭
        Integer[] arr = new Integer[N]; 
        
        for (int i=0; i<N; i++) {            
            arr[i] = Integer.parseInt(br.readLine());        
        }         Arrays.sort(arr);         
        
        for (int i = 0; i < N; i++) {            
            sb.append(arr[i]).append('\n');        
        }        
        //ù° �ٺ��� N���� �ٿ� ������������ ����
        System.out.println(sb);   
    }
}