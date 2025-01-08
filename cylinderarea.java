import java.util.Scanner;
class cylinderarea{
public static void main(String []args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the radius of cylinder");
double radius = sc.nextDouble();
System.out.println("Enter height");
double height = sc.nextDouble();

double volume = Math.PI * Math.pow(radius, 2) * height;
System.out.println("volume of cylinder is " + volume);
}
}