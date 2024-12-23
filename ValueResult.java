import java.util.Scanner;
public class ValueResult{
	public static void main(String[]args){
		Scanner v = new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a = v.nextInt();
		System.out.println("Please enter the value of b");
		int b = v.nextInt();
		System.out.println("The value of addition is "+ (a+b));
		System.out.println("The value of substract is"+ (a-b));
		System.out.println("The value of Multiplication is"+(a*b));
		System.out.println("The value of Division"+ (a/b));


}

}
	