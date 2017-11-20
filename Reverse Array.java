import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // total length
        int k = in.nextInt(); // total rotations
        int a[] = new int[n];
        int b[] = new int[n];
        
        // take input
         for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            }
        // perform back rotation
        while (k != 0) { 
            int j = 0;
         for(int i=1; i < n; i++){
           b[j] = a[i];
             j++;
         }
            b[n-1] = a[0];
            
            for(j = 0; j < n ; j++)
            {          
                a[j] = b[j]; 
            }
            
            k--;
        }
        
        for(int i=0; i < n; i++){
            System.out.print(a[i]+ " ");
            } 
    }
}
