package com.balu;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {


        System.out.println("Welcome. Thank you for taking the survey");

        Scanner scanner=new Scanner(System.in);


        System.out.println("What is your name?");
        String name=scanner.nextLine();

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice=scanner.nextDouble();

        System.out.println("How much money do you spend on fast food?");
        double foodPrice=scanner.nextDouble();


        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount=scanner.nextInt();

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount=scanner.nextInt();

  scanner.close();
        System.out.println("Thank you" + name + "for answering all the questions");
        System.out.println("Weekly, you spend "+(coffeeAmount*coffeePrice)+" $ on coffee");
        System.out.println("Weekly, you spend "+(foodAmount*foodPrice)+" $ on food");
       

    }
}

