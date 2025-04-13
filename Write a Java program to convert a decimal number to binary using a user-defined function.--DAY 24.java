import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); 
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int decimal = sr.nextInt(); 
        System.out.println(decimalToBinary(decimal));
    }
}