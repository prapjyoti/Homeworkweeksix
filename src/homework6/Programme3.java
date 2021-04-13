package homework6;
/*
Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme3 {
    //3.1 Declare one instance and one static variable.
    float a=1.5f;//instance variable
    static String name ="vansh";//static variable

   // 3.2 Declare one instance method.
    void myFriend1 (){
        System.out.println(a);//this calling statement for instance methods

    }
    // 3.2 Declare one static method.
    static void myFriend2 (){
        System.out.println(name);//this calling statement for static method

    }
    //3.5 declare main method
    public static void main(String[] args) {


        Programme3 obj = new Programme3();
        obj.myFriend1(); //instance method calling via object
        Programme3.myFriend2();//static method calling via class


    }

}
