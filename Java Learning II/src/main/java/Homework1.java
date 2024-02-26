import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args)

    {
        Scanner scanner=new Scanner(System.in);


      String firstName  ;
      String lastName;
      int age;
      String userName;

        System.out.println("Please enter your First Name");
        firstName=scanner.next();
        System.out.println("Please enter your Last Name");
        lastName=scanner.next();
        System.out.println("Please enter your Age");
        age=scanner.nextInt();
        System.out.println("Please enter your User Name");
        userName=scanner.next();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(userName);

        scanner.close();

    }
}
