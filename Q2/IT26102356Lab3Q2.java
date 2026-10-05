import java.util.Scanner;
public class IT26102356Lab3Q2{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		 
		double monthlySalary,otHours,otRate,otAmount,totalSalary;
		
		System.out.print("Enter Monthly Salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter no of OT hours: ");
		otHours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		otRate = input.nextDouble();
		
		otAmount = otHours * otRate;
		totalSalary = monthlySalary + otAmount;
		
		System.out.println();	
		System.out.println("the totalsalary including OT is: " +totalSalary);
			
	
	} 
}