import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            } else if (bit != '0') {
                throw new IllegalArgumentException("Invalid binary character: " + bit);
            }
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String binary = sr.nextLine(); 
        System.out.println(binaryToDecimal(binary));
    }
}