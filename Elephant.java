public class Elephant extends Pachyderm{

	// CONSTRUCTOR

	// call super class constructor with the elephant's name
	public Elephant(String name){
		super(name);
	}

	// METHODS

	// each elephant eats the same way
	public void eat(String food){
		if (!this.is_sleep) {
			System.out.println(this.name + " the Elephant shlurps up the " + food + " with its trunk.");
		}
	}

	// each elephant makes the same noise
	public void makeNoise(){
		if (!this.is_sleep) {
			System.out.println(this.name + " trumpets its trunk.");
		}
	}

}