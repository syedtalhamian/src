import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //question: make cgpa using marks of 3 subjects 
       System.out.println("enter marks in physics");
       float s1 = sc.nextFloat();
       System.out.println("enter marks in chemistry");
       float s2 = sc.nextFloat();
       System.out.println("enter marks in maths");
       float s3 = sc.nextFloat();
       float cgpa = (s1+s2+s3)/30;
       System.out.println("your cgpa is :");
       System.out.println(cgpa);

    }
}
