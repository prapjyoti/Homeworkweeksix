package homework6;
/*
Write a Java program to swap two variables.
 */

//import java.util.Scanner;

public class SwapVariables15 {
    //this is main method
    public static void main(String[] args) {
        //two variables
        int m,n,temp;//m and n are to swap
         m=20;
         n=30;
        System.out.println("before swapping: m,n = "+m+"," + +n);
        /*swapping*/
        temp=m;
         m=n;
         n=temp;
         //print the statement
        System.out.println("after swapping:"+m+", "+ + n );

         //solve with another method
       // int x,y,z;
       // Scanner sc= new Scanner(System.in);
       // System.out.println("Enter the value of x and y");
        //x=sc.nextInt();
        //y=sc.nextInt();
       // System.out.println("Before swapping numbers:"+x+"  "+y);
        //swapping//
       // z=x;
        //x=y;
        //y=z;
       // System.out.println("after swapping:"+x+"  "+y);
        //System.out.println();








    }
}
