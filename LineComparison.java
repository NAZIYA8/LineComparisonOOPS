package com.bridgelabz;
import java.util.Scanner;

public class LineComparison {
    public static  double distance;

    public static void main(String[] args) {
        LengthOfLine();
    }

    /**
     * x1 and y1 are the coordinates of point 1
     * x2 and y2 are the coordinates of point 2
     * @return length of a line
     */
    public static int LengthOfLine(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the point x1 ");
        int  x1 = scan.nextInt();
        System.out.println("Enter the point y1 ");
        int y1 = scan.nextInt();
        System.out.println("Enter the point x2 ");
        int x2 = scan.nextInt();
        System.out.println("Enter the point y2 ");
        int y2 = scan.nextInt();

        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of a line is " + distance);
        return (int) distance;
    }

}
