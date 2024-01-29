import java.util.Scanner;
public class cbse_per {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks  in english");
        int s1 = sc.nextInt();
        System.out.println("enter marks in computer");
        int s2 = sc.nextInt();
        System.out.println("enter marks in physics");
        int s3 = sc.nextInt();
        System.out.println("enter marks in chemistry");
        int s4 = sc.nextInt();
        System.out.println("enter marks in maths");
        int s5 = sc.nextInt();
        System.out.println("total marks out of five hundred is");
        int total = (s1+s2+s3+s4+s5);
        System.out.println(total);
        System.out.println("your percentage is");
        int per =(total/5);
        System.out.println(per);





    }
    
}
