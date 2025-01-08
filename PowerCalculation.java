import java.util.Scanner;

public class powercalculation {
    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter base");
	 double base = scanner.nextDouble();
	 System.out.println("Enter exponent");
	 double exponent = scanner.nextDouble();
	 double result = Math.pow(base,exponent);
	 System.out.println("power calculation is " + result);
	 }
	 }