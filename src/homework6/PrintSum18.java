package homework6;
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;

public class PrintSum18 {
    //this is main main method
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);//import scanner
        System.out.println("input first number");//first data data
        int num1=in.nextInt();
        System.out.println("input second number");//input second data
        int num2= in.nextInt();
     //print the statement
        System.out.println(num1+   "+" +  num2  +    "="  +    (num1+num2));//125 + 24 = 149

        System.out.println(num1+   "-" +  num2  +   "="  +    (num1-num2));//125 - 24 = 101

        System.out.println(num1+  "x" +  num2  +   "="  +    (num1*num2));//125 x 24 = 3000

        System.out.println(num1+  "/" +  num2  +   "="  +    (num1/num2));//125 / 24 = 5

        System.out.println(num1+ "mod" + num2 +  "=" +   (num1%num2));//125 mod 24 = 5


    }

}
