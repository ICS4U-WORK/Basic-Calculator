package calculator;

public class Calculator {

	double num1, num2, num3;
	
	public void averageThree() {
		// print out the average of three numbers
		System.out.print("The average of "+ num1 +", "+ num2 +"  and "+num3+" is ");
		System.out.println((num1 + num2 + num3) / 3.0);
		}
	public void getThreeNumbers() {
		System.out.println("please enter 3 numbers");
		num1=Keyboard.getDouble();
		num2=Keyboard.getDouble();
		num3=Keyboard.getDouble();
		averageThree();
	}

}
