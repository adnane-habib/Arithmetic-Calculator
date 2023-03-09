import java.util.Scanner;
public class MyClaculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter the first operand : ");
		float alpha = myScan.nextFloat();
		System.out.print("Enter the second operand : ");
		float beta = myScan.nextFloat();
		
		System.out.print("what kind of operation you want to perform?\nType 1 for addition\nType 2 for subtraction"
				+ "\nType 3 for multiplication\nOr type 4 for division (second operand must be non-null)\nEnter your choice now: ");

		int operation = myScan.nextInt();
		
		System.out.println("Your result is : "+alpha);
		System.out.println("Your result is : "+beta);

		Calculator myCalculation = new Calculator (alpha, beta, operation);

	}

}
