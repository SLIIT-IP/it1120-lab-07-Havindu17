import java.util.Scanner;
public class IT24103016Lab7Q3{
public static void main (String[] args ) {

Scanner input = new Scanner(System.in);
int customers = 5;
for (int i = 1; i <= customers; i++) {
System.out.println("Customer" +i );

double totalbill = input.nextDouble();
System.out.print("Enter total bill amount: ");

char paymentsMode = input.next().charAt(0);
System.out.print("Enter mode of payment (C for cash, 0 for other): ");

double discount = 0.0;
System.out print("Discount is:)

if (paymentMode == 'C') {
discount= totalbill* 0.05; 

} else if (paymentMode = "0' && paymentMode = '0' ){
System.out.println("Payment mode is Not Valid");

double finalAmount = totalbill -discount;
System.out.printl("Discount is: " + discount);
System.out.println("Amount to be paid: " + finalAmount);

System.out.println(); }
        }
    }

