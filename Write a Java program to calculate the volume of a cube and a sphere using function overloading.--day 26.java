import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static double calculateVolume(double sideLength) {
        return sideLength * sideLength * sideLength;
    }
    public static double calculateVolume(double radius, String shapeType) {
        return shapeType.equalsIgnoreCase("sphere")
                ? (4.0 / 3.0) * Math.PI * radius * radius * radius
                : -1; 
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        double sideLength = sr.nextDouble();

        double radius = sr.nextDouble();
        String shapeType = sr.next();

        double cubeVolume = calculateVolume(sideLength);
        double sphereVolume = calculateVolume(radius, shapeType);

        System.out.println(cubeVolume);
        System.out.println(sphereVolume);
    }
}