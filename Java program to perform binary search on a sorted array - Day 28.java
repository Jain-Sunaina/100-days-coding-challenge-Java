import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        String inputLine = sr.nextLine();
        String[] elements = inputLine.split(",");

        int[] arr = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i].trim());
        }
        int target = sr.nextInt();

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("element not found");
        }
    }
}