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
    public static void main(String[] args) {
        int x1, x2, y1, y2, a1, a2, b1, b2;
        Double distance1, distance2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the point x1 ");
        x1 = scan.nextInt();
        System.out.println("Enter the point y1 ");
        y1 = scan.nextInt();
        System.out.println("Enter the point x2 ");
        x2 = scan.nextInt();
        System.out.println("Enter the point y2 ");
        y2 = scan.nextInt();
        System.out.println("Enter the point a1 ");
        a1 = scan.nextInt();
        System.out.println("Enter the point b1 ");
        b1 = scan.nextInt();
        System.out.println("Enter the point a2 ");
        a2 = scan.nextInt();
        System.out.println("Enter the point b2 ");
        b2 = scan.nextInt();

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
