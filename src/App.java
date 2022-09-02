import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    double billAmount;
    try (Scanner inputScanner = new Scanner(System.in)) {
        System.out.println("Please input bill amount");
        billAmount = inputScanner.nextDouble();
    }
    if (billAmount <= 100){
        double discountAmount, finalamount;
        discountAmount = billAmount*5/100;
        finalamount = billAmount - discountAmount;

        System.out.println("You are eligible for the 5% discount," + "final amount is $" +finalamount);

    }
    else {
        double discountAmount,finalamount;
        discountAmount = billAmount*8/100;
        finalamount = billAmount - discountAmount;
     
        System.out.println("You are eligible for the 8% discount," + "final amount is $" +finalamount);
    }


    }
}
