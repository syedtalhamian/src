//Question:02 Get Input From User By Keyboard Using Java And Print It As Output.
//https://www.linkedin.com/in/syedtalhamian/

import java.util.Scanner; //Importing The Java Scanner Class

/*it is important to import Scanner class for getting 
the user input through keyboard*/

public class user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //this will create the Scanner object, it is neccessary to create one
       
        System.out.println("it works");
        //printing this to ensure that over code has started executing

        System.out.println("enter a number");
        //asking the user to enter an input

        int a = sc.nextInt();
        //taking the user input and storing it in "a"
        /*we have used the "nextInt" method because we are 
        getting a Integer as input  */
        System.out.println("your number is ");

        System.out.println(a);
        //this will print the input of the user


    }
}
