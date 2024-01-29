/*Question:06 Write A Java Program Which Asks The User
To Enter Their Name And Greets Them With
"hello <name>,Have A Good Day!" Text.*/

import java.util.Scanner; //Importing The Java Scanner Class

//make sure that the class name matches the name of the file
public class greetings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*this will create the Scanner object,
         it is neccessary to create one*/

        System.out.println("Please enter you name");
        //asking the user to enter their name

        String name = sc.next();
        //using the string data type to store their name

        System.out.println("hello " + name + ", Have a Good Day!");
        //printing the rquired statement

        
    }
}
