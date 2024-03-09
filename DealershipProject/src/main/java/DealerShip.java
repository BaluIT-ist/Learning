import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DealerShip {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println(" - Welcome To Balu's Dealership");
        System.out.println(" - Select option 'A' to buy a car");
        System.out.println(" - Select option 'B' to sell a car");
        String option=scan.nextLine();


        switch (option)
        {
            case "A":
                System.out.println("You chose option "+option);
                break;

            case "B":
                System.out.println("You chose option "+option);
            default: System.out.println("Invalid Option");

        }

    }
}
