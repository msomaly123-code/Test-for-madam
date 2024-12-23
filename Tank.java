import java.util.Scanner;
	public class Tank{
		
	public static void main(String[]args){
		
		Scanner Scanner=new Scanner(System.in);
		
		System.out.print("How many Litters of GAS available in the CAR:");
		
		double availableGas = Scanner.nextDouble();
		
		System.out.println("Whta is he price of 1 Litter of GAS: ");
		
		double cost = Scanner.nextDouble();
		
		System.out.println("How many miles the car can taavel for 1 litters of gas: ");
		
		double milesPerlittre = Scanner.nextDouble();
		
		double distance = milesPerlittre*availableGas;
		
		double littersneeded =250/milesPerlittre;
		
		double totalcost = littersneeded*cost;
		
		System.out.print("The car can travel + "distance"");





	
	
	
	
	}
	
	
	
	
	}