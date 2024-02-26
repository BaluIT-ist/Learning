import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);


        System.out.println("Hi there!What's your Name?");
        String name=scanner.nextLine();
        System.out.println("Nice to meet you "+name+"! Im JavaBot. Where are you From?");
        String city=scanner.nextLine();
        System.out.println("OW! I heard is so nice there! I'm from a place called Oracle! ");
        System.out.println("How old are you ? ");
        int age= scanner.nextInt();
        int xTimeOlder= 400/age;
        System.out.println("So you're "+age+" That means im "+xTimeOlder+" times older than you!!!");
        System.out.println("Well,it was nice talking to you! See u later !");

        scanner.close();




    }
}
