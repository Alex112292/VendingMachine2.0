import java.util.Scanner;

public class BetterVendingMachine {
    public static void main(String[] args)
    {
        Double A1, A2, B1, B2, C1, C2;
        A1 = C1 = B2 = 1.0;
        B1 = C2 = 2.0;
        A2 = 3.0;
        Double amountLeft = 0.0;
        System.out.println("Welcome to the Non-Trademarked Vending Machine! It's the vending machine that sells the opposites of the popular brands!");
        System.out.println("This machine only accepts $1 bills and will return exact change from your selection.");
        System.out.println("[A1] Macadamia Sad - $1.00, [B1] Stand's Chips - $2.00, [C1] Road Mix - $1.00, [A2] Andromeda - $3.00, [B2] Venus Bar - $1.00, [C2] 1 Dollar Bar - $2.00");
        System.out.println("How much money would you like to insert?");

        Scanner input = new Scanner(System.in);
        Double balance = input.nextDouble();
        int balanceInt = (int)Math.round(balance);

        System.out.println("Your current balance is: $" + balanceInt + ".");
        System.out.println("Please select a snack by entering it's code");

        Scanner input2 = new Scanner(System.in);
        String choice = input2.nextLine();
        System.out.println("You have selected " + choice + ".");
        System.out.println("Please confirm your selection by typing yes or no.");
        String confirmation = input2.nextLine();

        if(confirmation.equalsIgnoreCase("yes"))
        {
            switch (choice.toLowerCase()) {
                case "a1":
                    System.out.println("Getting A1");
                    choice = "Macadamia Sad";
                    amountLeft = balance - A1;
                    break;
                case "a2":
                    System.out.println("Getting A2");
                    choice = "Stand's Chips";
                    amountLeft = balance - A2;
                    break;
                case "b1":
                    System.out.println("Getting B1");
                    choice = "Road Mix";
                    amountLeft = balance - B1;
                    break;
                case "b2":
                    System.out.println("Getting B2");
                    choice = "Andromeda";
                    amountLeft = balance - B2;
                    break;
                case "c1":
                    System.out.println("Getting C1");
                    choice = "Venus Bar";
                    amountLeft = balance - C1;
                    break;
                case "c2":
                    System.out.println("Getting C2");
                    choice = "1 Dollar Bar";
                    amountLeft = balance - C2;
                    break;
                default:
                    System.out.println("That option does not exist!");
                    break;
            }
            System.out.format("\nAmount refunded: $%.2f\n", amountLeft);
            switch(choice)
            {
                case "Macadamia Sad":
                    System.out.println("Macadamia Sad the opposite of Almond Joy is one of the best sellers.");
                    break;
                case "Stand's Chips":
                    System.out.println("Stand's Chips, the competitor of Lay's Chips is a great choice!");
                    break;
                case "Road Mix":
                    System.out.println("Road Mix, the opposite of trail mix is a classic.");
                    break;
                case "Andromeda":
                    System.out.println("Some might say the Andromeda bar is better than the Milky Way. We hope you'll feel that way.");
                    break;
                case "Venus Bar":
                    System.out.println("Mars was always a less cool planet than Venus don't you think?");
                    break;
                case "1 Dollar Bar":
                    System.out.println("Not everyone can have 100 grand anytime they want.");
                    break;
            }
        }
        else if(confirmation.equalsIgnoreCase("no"))
        {
            System.out.println("Sorry that is not the right choice refunding all money.");
            System.out.format("\nAmount Refunded: $%.2f", balance);
        }
        else
        {
            System.out.println("That is not a valid option. Ending Transaction");
            System.out.format("\nAmount Refunded: $%.2f", balance);
        }

    }
}
