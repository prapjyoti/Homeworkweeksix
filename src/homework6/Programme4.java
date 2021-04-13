package homework6;
/*
Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.

 */

public class Programme4 {
    //4.1 Declare two instance and two static variables.
    //instance variable
    int n=18;
    double d=19.99d;
    //static variables
   static short sh=23145;
   static char ch='m';
   // 4.2 Declare one instance method.
void mySchool1() {
    //4.4Call all instance variable to print statement
    System.out.println(n);
    System.out.println(d);
}
    //4.3 declare one static method
    static void mySchool2(){
    //4.4 call all static variable to print statement
        System.out.println(sh);
        System.out.println(ch);

    }
    //this is main method
    public static void main(String[] args) {
        //4.6 Call both instance and static methods into the Main method and run the programme
        Programme4 obj1= new Programme4();
        obj1.mySchool1();
        Programme4.mySchool2();


    }



    }




