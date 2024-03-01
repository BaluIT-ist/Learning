import java.util.Scanner;

public class IfElseLearning {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);

        System.out.println("Gryffindor have that many points:");
        int Gryffindor=scanner.nextInt();
        System.out.println("Ravenclaw have that many points:");
        int Ravenclaw=scanner.nextInt();

        if (Gryffindor==Ravenclaw+300)
        {
            System.out.println("Gryffindor WON THE CHAMPIONSHIP");

        }
        else if (Gryffindor>= Ravenclaw)
        {
            System.out.println("Gryffindor got on second place!");
        }
        else if(Ravenclaw>=Gryffindor+100)
        {
            System.out.println("Griffyndor got on 3rd Place");
        }
        else
        {
            System.out.println("Gryffindor got on the 4th place");
        }
    }
}
