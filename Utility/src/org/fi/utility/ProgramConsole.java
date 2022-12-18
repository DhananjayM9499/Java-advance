package org.fi.utility;
public class ProgramConsole {

	public static void main(String[] args) {
		
	char choice;
	
		do {
		System.out.println("*-----CALCULATOR-----*");
		System.out.println("*--CHOOSE ANY OPTION--*\n1.ADD\n2.SUBSTRACT\n3.MULTIPLY\n4.DIVIDE\n5.EXIT");
		  choice = ConsoleInput.getString().charAt(0);
		
		Calculator objCalculator = new Calculator();

		switch (choice) {
		case '1':
			System.out.println("You choose Addition");
			System.out.println("Enter your first number");
			int num1 = ConsoleInput.getInteger();

			System.out.println("Enter second number");
			int num2 = ConsoleInput.getInteger();

			int result = objCalculator.add(num1, num2);
			System.out.println("Addition is " + result);
			break;

		case '2':
			System.out.println("You choose Substraction");
			System.out.println("Enter your first number");
			 num1 = ConsoleInput.getInteger();

			System.out.println("Enter second number");
			 num2 = ConsoleInput.getInteger();

			result = objCalculator.substract(num1, num2);

			System.out.println("Substraction is " + result);

			break;
			
		case '3':
			System.out.println("You choose Multiplication");
			System.out.println("Enter your first number");
			 num1 = ConsoleInput.getInteger();

			System.out.println("Enter second number");
			 num2 = ConsoleInput.getInteger();
			 result = objCalculator.multiply(num1,num2);
				System.out.println("Product is " + result);
			 break;

				
		case '4':
			System.out.println("You choose Division");
			System.out.println("Enter your first number");
			float number1 = ConsoleInput.getFloat();

			System.out.println("Enter second number");
			 float number2 = ConsoleInput.getFloat();
			float Result = objCalculator.divide(number1,number2);
				System.out.println("Division is " +Result);
             break;
             
		case '5' :
			System.out.println("Have a good day");
			System.exit(0);	
			
			break;
			}
		System.out.println("Do you want to continue (Y/N) ");
		choice =ConsoleInput.getString().charAt(0);
		
	
		}
		while(choice=='Y'||choice=='y'); {
		System.out.println("Have a good day");
		}
		
	}
}
