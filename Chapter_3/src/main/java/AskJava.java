import java.sql.SQLOutput;

public class AskJava {
    public static void main(String[] args)
    {

    double money=4.25;
    double price=3.75;

    int people=4;
    int maxPeople=10;

    String name="Dan";
    String secondName="Don";


        System.out.println("ME: Hi Java! Do i have enough money for a bag of chips ?");
        System.out.println("JAVA:"+(money>=price)+"\n");


        System.out.println("ME:Java, can the elevator sustain all of us  ?");
        System.out.println("Java:"+(people<=maxPeople)+"\n");

        System.out.println("ME: Does Dan and Don have the same name ?");
        System.out.println("Java: " +(name.equals(secondName))+ "\n");

    }
}
