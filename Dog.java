public class Dog extends Canine{

	// CONSTRUCTOR

	// call super class constructor with the dog's name
	public Dog(String name){
		super(name);
	}

	// METHODS

	// each dog eats in the same manner
	public void eat(String food){
		if (!this.is_sleep) {
			System.out.println(this.name + " the Dog eagerly scarfs up the " + food + ".");
		}
	}

	// each dog makes the same noise
	public void makeNoise(){
		if (!this.is_sleep) {
			System.out.println(this.name + " barks in a friendly manner.");
		}
	}

}