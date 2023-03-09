
public class Calculator {
	
	private float operand1;
	private float operand2;
	private int operator;
	
	public Calculator(float operand1, float operand2, int operator) {
		
		this.operand1 = operand1;
		this.operand2 = operand2;		
		this.operator = operator;
		
		switch (operator) {
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
		
		return this.operand1 + this.operand2;
	}
	private float subtraction() {
		
		return this.operand1 - this.operand2;
	}	
	private float multiplication() {
		
		return this.operand1 * this.operand2;
	}
	private float division() {
		
		return this.operand1 / this.operand2;
	}		
}
