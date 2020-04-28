package _04_popcorn;

public class PopcornMaker {

	public static void main(String[] args) {
		Microwave Dave = new Microwave();
		Popcorn Bavid = new Popcorn("Cheddar Cheese");
		
		Dave.putInMicrowave(Bavid);
		Dave.setTime(2);
		Dave.startMicrowave();
		Bavid.applyHeat();
		Bavid.eat();
		
		
		
		
		
	}

}
