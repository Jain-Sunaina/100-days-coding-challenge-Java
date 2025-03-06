import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        float b, h;
        
        Scanner sr = new Scanner(System.in);
        
        b = sr.nextFloat();
        h = sr.nextFloat();
        
        System.out.print((b*h)/2);
    }
}