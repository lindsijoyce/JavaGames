package projectseven;

import com.godtsoft.diyjava.DIYWindow;

public class NameGame extends DIYWindow {

	public NameGame() {
		// TODO Auto-generated constructor stub
		print("Enter a name.");
		String name = input();
		
		while (!name.equals("quit")) {

			print();
			checkName(name);
			print();
			
			print("Enter another name");
			name = input();
		}
		print("Thank you for playing my game!");
	}
	
	private void checkName(String name) {	

		print(name + " be nimble");
		print(name + " be quick,");
		print(name + " jump over the condelstick");
		print("");
		print("Way to go, " + name + "!");
		
		if (name.equals("Jack")) {
			print(name + ", your jumping skills are famous!");
		} else {
			print(name + ", I've never heard of you.");
		}
		
		if (name.equals("Lindsi")){
			print(name + " is a java programmer.");
		} else {
			print(name + ", are you a Java programmer?");
		}
		
		if (name.startsWith("King") || name.startsWith("Queen")) {
			print("Your highness!");
		}
		
		if (!name.equals("Billy")) {
			print("I'm waiting for Billy.");
		}
		
		if (!name.contains(" ")) {
			print("Don't you have a first and last name?");
		}
		
		if (name.startsWith("Dr.") && !name.equals("Dr. Frankenstein")) {
			print("Doctor, this is a medical emergency!");
		} else if (name.equals("Dr. Frankenstein")) {
			print("Dr. Frankenstein, no help is needed here.");
		} else {
			print("Is there a doctor in the house?");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NameGame();

	}

}
