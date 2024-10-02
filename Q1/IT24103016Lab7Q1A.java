import java.util.Scanner;
public class IT24103016Lab7Q1A {
public static void main (String[] args ) {

Scanner input = new Scanner(System.in);
int number = input.nextInt(); {
System.out.println("Enter marks for four subjects: ");

int number = input.nextInt(); {
System.out.println("Enter subject mark 1: ");

int number = input.nextInt(); {
System.out.println ("Enter subject mark 2: ");

int number = input.nextInt(); {
System.out.println("Enter subject mark 3: ");

int number = input.nextInt(); {
System.out.println("Enter subject mark 4: ");

double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

String grade;
if (average  >= 75 && average <= 100) {
System.out.println( Grade = "Distinction");

} else if(average >=50 && average <= 74 ) {
System.out.println( Grade = "Credit");

}else {
System.out.println( Grade = "Fail");


System.out.println(" Average is: " + average );
System.out.println(" Overall Grade is: " + Grade );   
     }
  }
    
