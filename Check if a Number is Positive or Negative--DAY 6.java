import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n;
        
        Scanner sr = new Scanner(System.in);
        
        n = sr.nextInt();
        
        if(n<0) {
            System.out.println("Negative");
        }
        else if(n==0) {
            System.out.println("Zero");
        }
        if(n>0) {
            System.out.println("Positive");
        }
    }
}