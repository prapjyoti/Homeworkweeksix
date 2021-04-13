package homework6;
/*
Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101
 */

public class AddBinary16 {
//this is main method
    public static void main(String[] args) {

        int a = 10;//first binary number
        int b = 11;//second binary number
        Integer integer= Integer.parseInt(String.valueOf(a),2);//java own command
        Integer integer1 =Integer.parseInt(String.valueOf(b),2);//jva own command

        Integer output=integer+integer1;//formula of sum of two binary

        System.out.println(Integer.toBinaryString(output));//print the statement

    }
}