package homework6;
/*
Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    //1.1 Declare two instance variables.
    int a=10;                  //instance variable
    static String name ="Shiv";//instance variable

    //1.2 Declare one instance method.
    void d1 (){
        //instance area
        //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println(a);
        System.out.println(name);

    }
// 1.4 this is main method

public static void main(String[] args) {
    //1.5 Call the above instance method into the Main method and Run the programme.
    Programme1 obj = new Programme1();//obj created
    obj.d1();// calling method


}
}
