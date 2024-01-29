/*Question:08 Write A Java Program To Detect Whether A Number Entered 
By The User Is An Integer Or Not.*/
//https://www.linkedin.com/in/syedtalhamian/

import java.util.Scanner;//Importing The Java Scanner Class

//make sure that the class name matches the name of the file
public class int_chk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*this will create the Scanner object,
        it is neccessary to create one*/

        System.out.println("enter a number");
        /*asking the user to enter a number to check
        whether it is an integer or not*/

        System.out.println(sc.hasNextInt());
        /*here we have used the "hasNextInt" method to check, within the
        print function. beacuse of this the true or false
        value will be printed directly*/
    }
}
