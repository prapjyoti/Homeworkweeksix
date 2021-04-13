package homework6;
/*
Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */

public class StringLowerCase19 {
    //this is main method
    public static void main(String[] args) {
        String S1="THE QUICK BROWN FOR JUMPS OVER THE LAZY DOG.";//convert into lowercase
        String result = S1.toLowerCase();//formula to convert
        System.out.println(result);//print the outcome
    }
}
