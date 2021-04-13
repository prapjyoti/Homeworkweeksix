package homework6;
/*
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */
public class Calculator5 {
    int a=25;
    int b=10;
    //this is static variables
    static int d=35;
    static int e=20;

    //instance method
    void addition() {
        int k=(a+b);

        System.out.println("a+b "+k);//this is addition
    }
    void subtraction(){
        int m=(a-b);

        System.out.println("a-b "+m);//this is subtraction
    }

//  one static method

static void multiplication(){
        int j=(d*e);
    System.out.println("d*e "+j);//this is multiplication

}
static void division() {
    int p=(d/e);
        System.out.println("d/e "+p);//this is division
}
//this is main method
    public static void main(String[] args) {
        Calculator5 obj = new Calculator5();
        obj.addition();
        obj.subtraction();
        Calculator5.multiplication();
        Calculator5.division();
    }
    }
