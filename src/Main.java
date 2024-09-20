import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.00");
        Scanner ask = new Scanner(System.in);

        System.out.print("Enter your Bill($): ");
        double bill = Double.parseDouble(ask.nextLine());

        System.out.print("Tip Percent: ");
        double tip = Double.parseDouble(ask.nextLine());

        System.out.print("Number of people: ");
        double ppl = Double.parseDouble(ask.nextLine());

        System.out.println();

        double amount =  bill * (tip / 100);
        amount = Double.parseDouble(df.format(amount));

        double per = amount/ppl;
        per = Double.parseDouble(df.format(per));

        double total = (bill/ppl + per);
        bill += amount;

        System.out.println("___________________________________");
        System.out.println("Total Tip Amount: $" + df.format(amount));
        System.out.println("Total Bill Cost: $" + df.format(bill));
        System.out.println("Tip per person: $" + df.format(per));
        System.out.println("Total bill per person: $" + df.format(total));
        System.out.println("___________________________________");
    }
}