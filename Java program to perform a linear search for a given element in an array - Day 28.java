import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        String arrayInput = sr.nextLine();
        String[] parts = arrayInput.split(",");

        int[] arr = new int[parts.length];
        
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        
        int target = sr.nextInt();

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("element not found");
        }
    }
}