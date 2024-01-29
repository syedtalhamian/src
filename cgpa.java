//Question:05 Calculate The CGPA Of A Student Using The Marks Given By The User Using Java.
//https://www.linkedin.com/in/syedtalhamian/

import java.util.Scanner;//Importing The Java Scanner Class

//make sure that the class name matches the name of the file
public class cgpa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //this will create the Scanner object, it is neccessary to create one
       
        //here we are using marks of three subjects to calculate cgpa

       System.out.println("enter marks in physics");
       //asking the user to input the marks for the given subject

       float s1 = sc.nextFloat();
       //storing the marks in float because the cgpa could be in decimal.
       /*it is necessary to use float data type otherwise 
       we would get only the integer part of the cgpa as answer*/

       System.out.println("enter marks in chemistry");
       float s2 = sc.nextFloat();
       System.out.println("enter marks in maths");
       float s3 = sc.nextFloat();

       float cgpa = (s1+s2+s3)/30;
       /*calculating the cgpa, here we will divide by 30,
        because cgpa is given out of 10 and the marks were out of 100 each*/

       System.out.println("your cgpa is :");
       System.out.println(cgpa);
       //printing the cgpa



    }
}
