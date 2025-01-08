import java.util.Scanner;

public class average {
    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter First Number");
	 double num1 = scanner.nextDouble();
	 System.out.println("Enter Second Number");
	 double num2 = scanner.nextDouble();
	 System.out.println("Enter Third Number");
	 double num3 = scanner.nextDouble();
	 double average = (num1+num2+num3)/3;
	 System.out.println("Average of Three Number is " + average);
	 }
	 }