import java.util.Scanner;
public class Acceptpoint{
	public static void main(String[] args){
		Scanner y=new Scanner(System.in);
		System.out.println("Please Enter X1");
		int X1 = y.nextInt();
		System.out.println("Please Enter X2");
		int X2 =y.nextInt();
		System.out.println("Please Enter Y1");
		int Y1 = y.nextInt();
		System.out.println("Please Enter Y2");
		int Y2 =y.nextInt();
		double p = Math.sqrt(Math.pow(X2-X1,2) + Math.pow(Y2-Y1,2));
		System.out.println("The distnace between two point is " + p);

	} 
}

