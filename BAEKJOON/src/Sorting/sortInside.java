package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 
//��Ʈ�λ��̵�
public class sortInside {    
    
    public static void main(String[] args) throws IOException {     
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        char[] ch = br.readLine().toCharArray(); 
        
        //�������� ����        
        Arrays.sort(ch); 
        
        //�������� ���        
        for (int i=ch.length-1; i>=0; i--) {            
            System.out.print(ch[i]);        
        }   
        
    }
    
}