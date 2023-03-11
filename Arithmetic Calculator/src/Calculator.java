
public class Calculator {
	
	private float operand1 = 0;
	private float operand2 = 0;
	private int operator = 0;
	
	public Calculator(float operand1, float operand2, int operator) {
	//Constructor method to initialize the class	
		this.operand1 = operand1;
		this.operand2 = operand2;		
		this.operator = operator;
		
	//The constructor will automatically render the operation result based on the input	
		switch (this.operator) {
		case 1:
				System.out.println("The result of the addition is "+this.addition());
				break;
		case 2:
			System.out.println("The result of the addition is "+this.subtraction());
			break;
		case 3:
			System.out.println("The result of the addition is "+this.multiplication());
			break;
		case 4:{
			if (this.operand2 == 0)
				System.out.println("The division cannot be performed since the divisor is null");
			else
				System.out.println("The result of the addition is "+this.division());
			break;
			}
		default:
			System.out.println("You have not chosen a correct operator.");

		}
	}
	
	private float addition() {
		//method for calculating the sum
		return this.operand1 + this.operand2;
	}
	private float subtraction() {
		//method for calculating the difference
		return this.operand1 - this.operand2;
	}	
	private float multiplication() {
		//method for calculating the product		
		return this.operand1 * this.operand2;
	}
	private float division() {
		//method for calculating the ratio	
		return this.operand1 / this.operand2;
	}		
}
