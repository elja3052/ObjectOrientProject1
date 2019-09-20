public class Rhino extends Pachyderm{

	// CONSTRUCTOR

	// call super class constructor with the rhino's name
	public Rhino(String name){
		super(name);
	}

	// METHODS

	// each rhino eats in the same way
	public void eat(String food){
		if (!this.is_sleep) {
			System.out.println(this.name + " the Rhino impales the " + food + " with its tusk before eating it.");
		}
	}

	// each rhino makes the same noise
	public void makeNoise(){
		if (!this.is_sleep) {
			System.out.println(this.name + " makes a low growl.");
		}
	}

}