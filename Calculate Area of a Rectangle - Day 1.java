import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.printf("%.1f\n", area);
       
    }
}