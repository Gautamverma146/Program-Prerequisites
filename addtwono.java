
import java.util.Scanner;
public class addtwono{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first no.");
		int a =sc.nextInt();
	
		System.out.println("enter second no.");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("The sum of " + a + " and " + b + " is: " + sum);
		
	}
}