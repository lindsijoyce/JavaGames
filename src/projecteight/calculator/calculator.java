package projecteight.calculator;

import com.godtsoft.diyjava.DIYWindow;
import projecteight.mywindow.MyWindow;

public class calculator extends MyWindow {
	
	public calculator() {
		
		String s = "Y";
		
		while (s.startsWith("Y") || s.startsWith("y")) {
			double a = promptForDouble("Enter a number");
			String operation = promptForString("Choose an operation.");
			double b = promptForDouble("Enter a number");
			double c = 0;
			
			switch(operation) {
			case "+" :
				c = a + b;
				print(a + " + " + b + " = " + c);
				break;
			case "-" :
				c = a - b;
				print(a + " - " + b + " = " + c);
				break;
			case "*" :
				c = a * b;
				print(a + " * " + b + " = " + c);
				break;
			case "/" :
				try {
					c = a / b;
					print(a + " / " + b + " = " + c);
					break;
				} catch(ArithmeticException e) {
					print("Division by zero is not allowed.");
				}
			default:
				print("Not a valid operation, try again.");
			}
			s = promptForString("Do you want to enter another number?");
		}
		
	
	}

	public static void main(String[] args) {
		
		new calculator();

	}

}
