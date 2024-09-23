import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.00");
        Scanner ask = new Scanner(System.in);

        System.out.print("Enter your Bill($): ");                   // ask for input of bill amount
        double bill = Double.parseDouble(ask.nextLine());           //set inputted value as bill

        System.out.print("Tip Percent: ");                          // ask for input of tip percent
        double tip = Double.parseDouble(ask.nextLine());            //set inputted value as tip

        System.out.print("Number of people: ");                     // ask for input of people amount
        double ppl = Double.parseDouble(ask.nextLine());            //set inputted value as ppl

        System.out.println();

        double amount =  bill * (tip / 100);                        // (tip/100) = tip percent
        amount = Double.parseDouble(df.format(amount));             // formats the variable amount as ##.00

        double per = amount/ppl;                                    // finds tip amount each person has to pay
        per = Double.parseDouble(df.format(per));                   // formats the variable per as ##.00

        double total = (bill/ppl + per);                            // find total amount each person has to pay
        bill += amount;                                             // adds the tip to the bill amount to have total bill cost

        System.out.println("___________________________________");
        System.out.println("Total Tip Amount: $" + df.format(amount));
        System.out.println("Total bill Cost: $" + df.format(bill));
        System.out.println("Tip per person: $" + df.format(per));
        System.out.println("Total bill per person: $" + df.format(total));
        System.out.println("___________________________________");
    }
}