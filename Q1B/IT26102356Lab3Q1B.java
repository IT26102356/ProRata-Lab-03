import java.util.Scanner;

public class IT26102356Lab3Q1B{
	public static void main(String[] args){
		
		double price,kilo,amount,discount,finalamount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		price=input.nextDouble();
		
		System.out.print("Enter the no. of kilogrames you want to buy: ");
        kilo=input.nextDouble();
        
        amount = price * kilo;
		discount = amount * 0.10;
		finalamount = amount - discount;
		
		System.out.println();
		System.out.println("the total amount with 10%  discount is: " +amount); 

        		
		
		
	}
}