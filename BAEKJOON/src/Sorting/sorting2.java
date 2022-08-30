package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 
// 수 정렬하기 2
public class sorting2 {    
    public static void main(String[] args) throws IOException {        
        //수의 갯수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder sb = new StringBuilder();        
        int N = Integer.parseInt(br.readLine());       
        
        //입력받는 수의 배열
        Integer[] arr = new Integer[N]; 
        
        for (int i=0; i<N; i++) {            
            arr[i] = Integer.parseInt(br.readLine());        
        }         Arrays.sort(arr);         
        
        for (int i = 0; i < N; i++) {            
            sb.append(arr[i]).append('\n');        
        }        
        //첫째 줄부터 N개의 줄에 오름차순으로 정렬
        System.out.println(sb);   
    }
}