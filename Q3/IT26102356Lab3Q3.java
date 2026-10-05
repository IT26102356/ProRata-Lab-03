import java.util.Scanner;
public class IT26102356Lab3Q3{
	public static void main(String[] args){
	 
	 int amount, notes5000, notes1000, notes500, notes200, notes100, notes50, notes20, coins10, coins05, coins02, coins01;
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("enter the rupee amount: ");
	 amount= input.nextInt();
	 
	 notes5000 = amount / 5000;
	 amount = amount % 5000;
	 
	 notes1000 = amount / 1000;
	 amount = amount % 1000;
	 
	 notes500 = amount / 500;
	 amount = amount % 500;
	 
	 notes200 = amount / 200;
	 amount = amount % 200;
	 
	 notes100 = amount / 100;
	 amount = amount % 100;
	 
	 notes50 = amount / 50;
	 amount = amount % 50;
	 
	 notes20 = amount / 20;
	 amount = amount % 20; 
	 
	 coins10 = amount / 10;
	 amount = amount % 10;
	  
	 coins05 = amount / 05;
	 amount = amount % 05;
	 
	 coins02 = amount / 02;
	 amount = amount % 02;
	 
	 coins01 = amount / 01;
	 amount = amount % 01;
	 
	 System.out.println();
	 
	 System.out.println("5000 Notes - " + notes5000);
	 System.out.println("1000 Notes - " + notes1000);
	 System.out.println("500 Notes - " + notes500);
	 System.out.println("200 Notes - " + notes200);
	 System.out.println("100 Notes - " + notes100);
	 System.out.println("50 Notes - " + notes50);
	 System.out.println("20 Notes - " + notes20);
	 System.out.println("10 coins - " + coins10);
	 System.out.println("05 coins - " + coins05);
	 System.out.println("02 coins - " + coins02);
	 System.out.println("01 coins - " + coins01);
	}
}