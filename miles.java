import java.util.Scanner;

public class miles {
    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter Distance in kilometer");
	 double kilometer = scanner.nextDouble();
	
	 double miles = kilometer * 0.621371;
	 System.out.println("Miles = " + miles);
	 
	 }
	 }