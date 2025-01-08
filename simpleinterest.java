import java.util.Scanner;
class simpleinterest{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the principal");
double principal = sc.nextDouble();
System.out.println("Enter Rate");
double rate =sc.nextDouble();
System.out.println("Enter Time");
double time = sc.nextDouble();

double si = principal * rate * time/100;
 System.out.println("The simple interest is " + si);
 }
 }
