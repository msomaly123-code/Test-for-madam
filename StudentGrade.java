import java.utill.scanner;
import java.util.scanner;
public class Grade{
	public static void main (String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter number of Students: ");
		int n = s.nextInt();
		double marks;
		
		for(int i=1;i<=n; i++){
			
			Sytem.out.println(Enter Marks for Student" +i);
			marks= s.nextInt();
			
		if (marks>=90){
			System.out.println("A");
		
	else if(marks>=80)
			System.out.println("B");
	
	else if(marks>=70)
		System.out.println("C");
	
	else if(marks>=60)
		System.out.println("D");
	
	else {
		System.out.println("F");
	}
		}
		}		
		
		

}
}