package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    /**
     * x1 and y1 are the coordinates of point 1
     * x2 and y2 are the coordinates of point 2
     * a1 and b1 are the coordinates of point 1
     * a2 and b2 are the coordinates of point 2
     * length of line is caluculted
     * check if line 1 and line 2 are equal
     * Compare if distances are Equal ,Greater or less using compareTo method
     */
    public static Double distance1, distance2;

    public static void main(String[] args) {
        compareTo();
    }

    public static void compareTo() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the point x1 ");
        int x1 = scan.nextInt();
        System.out.println("Enter the point y1 ");
        int y1 = scan.nextInt();
        System.out.println("Enter the point x2 ");
        int x2 = scan.nextInt();
        System.out.println("Enter the point y2 ");
        int y2 = scan.nextInt();
        System.out.println("Enter the point a1 ");
        int a1 = scan.nextInt();
        System.out.println("Enter the point b1 ");
        int b1 = scan.nextInt();
        System.out.println("Enter the point a2 ");
        int a2 = scan.nextInt();
        System.out.println("Enter the point b2 ");
        int b2 = scan.nextInt();

        distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        distance2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

        System.out.println("Length of a line1 is " + distance1);
        System.out.println("Length of a line2 is " + distance2);

        int compareValue = distance1.compareTo(distance2);

        if (compareValue == 0) {
            System.out.println("distance1 and distance2 are EQUAL ");
        } else if (compareValue < 0) {
            System.out.println("distance1 is LESS than distance2");
        } else {
            System.out.println("distance1 is GREATER than distance2");
        }
    }
}


