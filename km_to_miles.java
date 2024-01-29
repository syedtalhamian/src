/*Question:07 Write A Java Program To Convert Kilometers To Miles.*/
//https://www.linkedin.com/in/syedtalhamian/

import java.util.Scanner;//Importing The Java Scanner Class

//make sure that the class name matches the name of the file
public class km_to_miles {

	public static void main(String[] args) {

		double kilometers; //defining the data type of kms as double

		System.out.println("Please enter kilometers:");
        //asking the user to enter kilometers

		Scanner sc = new Scanner(System.in);
        /*this will create the Scanner object,
        it is neccessary to create one*/

		kilometers = sc.nextDouble();
        //storing the kms 

		double miles = kilometers / 1.6;
        //calculating miles and storing in "miles"

		System.out.println(miles + " Miles");
        //printing the result

	}
}