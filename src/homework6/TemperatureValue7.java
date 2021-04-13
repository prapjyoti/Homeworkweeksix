package homework6;
/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */


import java.util.Scanner;

public class TemperatureValue7 {
    //main method
    public static void main(String[] args) {
        float temperature;//veriables
        Scanner in = new Scanner(System.in);//import the scanner
        System.out.println("Enter temperature in Fahrenheit");//enter the value of tem in fahrenheit

        temperature = in.nextInt();//formula of degree fah and convert to degree cel
        temperature= ((temperature -32)*5)/9;//value enter the temp
        System.out.println("temperature in celsius = " +temperature);//print the statement in celsius


    }
}
