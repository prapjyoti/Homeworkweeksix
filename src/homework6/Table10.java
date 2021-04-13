package homework6;
/*Write a Java program that takes a number as input and prints its
        multiplication table up to 10.
        Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.Scanner;

public class Table10 {
//this is main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //call for print
        System.out.println("input a number");
        //Table formula
        int num1 = input.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)));//print the statement

        }

    }
}