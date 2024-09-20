import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.##");
        Scanner ask = new Scanner(System.in);
        System.out.print("Enter your Bill($): ");
        double bill = Double.parseDouble(ask.nextLine());
        System.out.print("Tip Percent: ");
        double tip = Double.parseDouble(ask.nextLine());
        System.out.print("Number of people: ");
        double ppl = Double.parseDouble(ask.nextLine());


        double amount = bill * (tip/100);
        double per = amount/ppl;
        double total = (bill/ppl + per);
        bill += amount;


        System.out.println(df.format(amount));
        System.out.println(bill);

        System.out.println(per);
        System.out.println(total);



    }
}