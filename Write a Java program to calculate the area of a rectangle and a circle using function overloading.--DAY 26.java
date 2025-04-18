import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        double length = sr.nextDouble();
        double width = sr.nextDouble();

        double radius = sr.nextDouble();

        double rectangleArea = calculateArea(length, width);
        double circleArea = calculateArea(radius);

        System.out.println(rectangleArea);
        System.out.println(circleArea);
    }
}