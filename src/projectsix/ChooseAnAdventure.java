package projectsix;

import com.godtsoft.diyjava.DIYWindow;

public class ChooseAnAdventure extends DIYWindow {

	public ChooseAnAdventure() {
		startStory();
	}	
		
	private void startStory() {
		
		print();
		
		String story = "I woke up in unfamiliar woods.";
		story = story + " I was hungry and tired.";
		story = story + " I didn't know where I was.";
		story = story + " In my pocket were three beans.";
		story = story + " Up the hill was a well.";
		story = story + " To the right was a small cottage.";
		
		print(story);
		
		print();
		
		print("Should I:");
		print("a) Go up the hill?");
		print("b) Check out the cottage?");
		print("c) Plant the beans?");
		
		print();
		
		String choice = input();
		
		switch(choice) {
		case "a" :
			goUpTheHill();
			break;
		case "b" :
			checkTheCottage();
			break;
		case "c" :
			plantTheBeans();
			break;
		default :
			startStory();
		}
	}
	
	private void goUpTheHill() {
		print();
		String story = "On my way up the hill, a girl joined me.";
		story = story + " She told me her name was Jill.";
		story = story + " She was carrying a pail.";
		story = story + " There's also a trail of breadcrumbs going down another path.";
		print(story);
		print();
		print("Should I?");
		print();
		print("a) Ask Jill to join me?");
		print("b) Follow the trail of bread crumbs");
		print();
		
		String choice = input();
		
		switch(choice) {
		case "a" :
			goWithJill();
			break;
		case "b" :
			followBreadCrumbs();
			break;
		default :
			goUpTheHill();
		}	
	}
		
	private void checkTheCottage() {
		String story = "There are 3 bowls of porridge, 3 comfortable chairs, and 3 soft beds.";
		story = story + " I was hungry and worn out.";
		print(story);
		print();
		print("Should I:");
		print("a) Eat the porridge?");
		print("b) Sit in one of the chairs?");
		print("c) Take a nap in one of the beds?");
		print();
		
		String choice = input();
		
		switch(choice) {
		case "a" :
			eatThePorridge();
			break;
		case "b" :
			sitOnTheChair();
			break;
		case "c" :
			takeANap();
		default :
			checkTheCottage();
		}
	}
		
	private void takeANap() {
		print("I took a nap.");
	}

	private void sitOnTheChair() {
		print("I sat on the chair.");
	}

	private void eatThePorridge() {
		print("I ate the porridge.");
	}

	private void plantTheBeans() {
		print("Planting beans.");
		}
	
	private void goWithJill() {
		String story = "I was so much enjoying listening to Jill's stories.";
		story = story + " I didn't notice the branch across the path.";
		story = story + " I fell down.";
		print(story);
		print();
		print("What happened next?");
		print("a) I broke my crown and Jill came tumbling after.");
		print("b) The beans fell out of my pocket and immediately sprouted a bean stalk");
		print();
		
		String choice = input();
		
		switch(choice) {
		case "a" :
			brokeMyCrown();
			break;
		case "b" :
			sproutedABeanStalk();
			break;
		}
	}
	
	private void followBreadCrumbs() {
		String story = "I followed the bread crumbs for a while.";
		story = story + "Jill had to go to her grandmother's house.";
		story = story + "Before she left, Jill warned me about the cottage in the woods";
		print(story);
		print();
		print("Should I:");
		print("a) Go with Jill?");
		print("b) Check out the cottage in the woods?");
		
		String choice = input();
		
		switch(choice) {
		case "a" :
			goWithJill();
			break;
		case "b" :
			checkTheCottage();
			break;
		}
	}
	
	private void brokeMyCrown() {
		print("I broke my crown.");
	}
	
	private void sproutedABeanStalk() {
		print("A bean stalk sprouted.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChooseAnAdventure();
		
		}

	}

