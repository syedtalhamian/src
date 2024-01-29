//Question:04 Use Marks Provided By The User TO Find Percentage Of A Student Using Java.
//https://www.linkedin.com/in/syedtalhamian/

import java.util.Scanner; //Importing The Java Scanner Class

/*it is important to import Scanner class for getting 
the user input through keyboard*/

//make sure that the class name matches the name of the file
public class cbse_per {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //this will create the Scanner object, it is neccessary to create one
        
        System.out.println("enter marks  in english");
        //asking the user to input the marks for the given subject

        int s1 = sc.nextInt();
        //storing the entered data in s1(subject one)

        System.out.println("enter marks in computer");
        int s2 = sc.nextInt();
        System.out.println("enter marks in physics");
        int s3 = sc.nextInt();
        System.out.println("enter marks in chemistry");
        int s4 = sc.nextInt();
        System.out.println("enter marks in maths");
        int s5 = sc.nextInt();


        int total = (s1+s2+s3+s4+s5);
        //calculating the total marks out of 500 beacuse we are using 5 subjects having max marks 100
        System.out.println("total marks out of five hundred are");
        System.out.println(total);
        //printing total marks

        int per =(total/5);
        //calculating percentage and storing it in 'per'
        System.out.println("your percentage is");
        System.out.println(per + "%");
        //printing the percentage






    }
    
}
