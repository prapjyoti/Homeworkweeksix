package homework6;
/*
Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.5 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.sql.SQLOutput;

public class PerimeterRectangle14 {
    //this is main method
    public static void main(String[] args) {

        final double width=5.6;//assign value
        final double height=8.5;//assign value

        double area= width*height;//formula
        double perimeter= 2*(width + height);//find the perimeter
      //print the outcome as per statement.
        System.out.printf("Perimeter is 2*(%.1f + %.1f)= %2f \n",height,width,perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n" ,width,height,area);

    }




}
