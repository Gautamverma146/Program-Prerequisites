import java.util.Scanner;
class rectangle{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter length of rectangle");
double lenght = sc.nextDouble();
System.out.println("enter width of rectangle");
double width = sc.nextDouble();
double perimeter = 2 * (lenght + width);
System.out.println("Perimeter of rectangle is " + perimeter);
}
}

