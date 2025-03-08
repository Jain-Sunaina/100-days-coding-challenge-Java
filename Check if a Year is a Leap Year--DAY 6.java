import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int y;
        
        Scanner sr = new Scanner(System.in);
        
        y = sr.nextInt();
        
        if(y%4==0 && y%100!=0 || y%400==0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}