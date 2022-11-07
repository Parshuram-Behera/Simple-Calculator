package com.parshuram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("THIS IS YOUR CALCULATOR ---> Let's Calculate");

        int t = 1;
        while (t != 0) {
            System.out.println("Enter First Number");
            Scanner num = new Scanner(System.in);
            float num_1 = num.nextFloat();
            System.out.println("Enter Second number");
            float num_3 = num.nextFloat();

            System.out.println("Enter The Operation You Want : + , - , x , /");
            System.out.println(
                    """
                            PRESS 1-- For +\s
                            PRESS 2-- For -\s
                            PRESS 3-- For x\s
                            PRESS 4-- For /\s
                            """);
            int opt = num.nextInt();
//        System.out.print("The Sum Is : ");
//        System.out.print(num_1 + num_2);

            switch (opt) {
                case 1 -> System.out.println(("The Sum Is :") + (num_1 + num_3));
                case 2 -> System.out.println(("The Subtract Is : ") + (num_1 - num_3));
                case 3 -> System.out.println(("The Multiplication Is :") + (num_1 * num_3));
                case 4 -> System.out.println(("The division Is :") + (num_1 / num_3));
                default -> System.out.println("Invalid operation");


            }

            System.out.println("Want To Calculate Again Press ---> 0 ");
            int choice = num.nextInt();
            
            if ( choice == 0){
                t++;
            }
            else {
                break;
            }

        }
    }
}
