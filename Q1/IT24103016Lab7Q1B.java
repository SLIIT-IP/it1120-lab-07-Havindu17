import java.util.Scanner;
public class IT24103016Lab7Q1B {
public static void main (String[] args ) {

Scanner input = new Scanner(System.in);
for (int student = 1;student <= 3; student++) {
System.out.println("Student" + student);

System.out.print("Enter the marks student:");
int mark1= input.nextInt();
int mark2 = input.nextInt();
int mark3 = input.nextInt();
int mark4 = input.nextInt();


Double average = (mark1 + mark2 + mark3 + mark4) /4.0;

String grade;
if ( average >= 75 && average <= 100 ) {
System.out.println(grade = "Distinction");

} else if (average > 50 && average < 75 ) {
System.out.println(grade = "Credit");

} else  {
System.out.println(grade = "Fail");}

System.out.println( " average is: " + average);
System.out.println( "Overall Grade is: " + grade);
System.out.println();
             }
          }
       }



