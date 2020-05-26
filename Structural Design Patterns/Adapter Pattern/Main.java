package adapter;

public class Main {

	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		ToyDuck duck = new PlasticToyDuck();
		
		//Wrapping a bird in birdAdapter so it behaves like toy duck
		ToyDuck birdAdapter = new BirdAdapter(sparrow);
		
		sparrow.fly();
		sparrow.makeSound();
		
		duck.squeak();
		
		birdAdapter.squeak();
		

	}

}
