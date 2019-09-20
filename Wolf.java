public class Wolf extends Canine{

	// CONSTRUCTOR

	// call super class constructor with the wolf's name
	public Wolf(String name){
		super(name);
	}

	// METHODS

	// each wolf eats the same way
	public void eat(String food){
		if (!this.is_sleep) {
			System.out.println(this.name + " the Wolf eagerly snarfs down the " + food + ".");
		}
	}

	// each wolf makes the same noise
	public void makeNoise(){
		if (!this.is_sleep) {
			System.out.println(this.name + " howls into the sky.");
		}
	}

}