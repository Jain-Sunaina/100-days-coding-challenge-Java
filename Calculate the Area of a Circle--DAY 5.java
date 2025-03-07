import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        float pi = 3.14f;    
        double r;
        
        Scanner sr = new Scanner(System.in);
        
        r = sr.nextDouble();
        
        System.out.printf("%.1f\n", pi*r*r);
    }
}