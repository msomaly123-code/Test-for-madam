import java.util.Scanner;
public class Areatriangle{
	public static void main(String[]args){
		Scanner x=new Scanner(System.in);
		System.out.println("Please enter letter a");
		int a = x.nextInt();
		System.out.println("Please enter letter b");
		int b = x.nextInt();
		System.out.println("Please Enter letter c");
		int c = x.nextInt();
		double s= (a+b+c)/2;
		System.out.println("The Area of triangle is " + s);
		double a = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The Area of triangle is " + a);
}

}
