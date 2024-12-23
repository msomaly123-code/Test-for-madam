import java.util.Scanner;
public class Numbers{
	public static void main (String[]args){
		Scanner s=new Scanner(System.in);
		
		
		String number;
		while(true){
			System.out.print("Please Enter Number: ");
			number = s.nextLine();
			if(number.equalsIgnoreCase("done")){
				break:
			}
			total =total + Double.parseDouble(number);
			count++;
		}
	}
}