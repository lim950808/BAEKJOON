package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 
//소트인사이드
public class sortInside {    
    
    public static void main(String[] args) throws IOException {     
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        char[] ch = br.readLine().toCharArray(); 
        
        //오름차순 정렬        
        Arrays.sort(ch); 
        
        //역순으로 출력        
        for (int i=ch.length-1; i>=0; i--) {            
            System.out.print(ch[i]);        
        }   
        
    }
    
}