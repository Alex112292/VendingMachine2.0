import java.util.Scanner;

public class BetterVendingMachine {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Non-Trademarked Vending Machine! It's the vending machine that sells the opposites of the popular brands!");
        System.out.println("This machine only accepts $1 bills and will return exact change from your selection.");
        System.out.println("[A1] Macadamia Sad - $1.00, [B1] Stand's Chips - $2.00, [C1] Road Mix - $1.00, [A2] Andromeda - $3.00, [B2] Venus Bar - $1.00. [C2]  - $2.00");
        System.out.println("How much money would you like to insert?");

        Scanner input = new Scanner(System.in);
        Double balance = input.nextDouble();
        int balanceInt = (int)Math.round(balance);

        System.out.println("Your current balance is: $" + balanceInt + ".");
        System.out.println("Please select a snack by entering it's code");

        Scanner input2 = new Scanner(System.in);
        String choice = input2.nextLine();
        System.out.println("You have selected " + choice + ".");
    }
}
