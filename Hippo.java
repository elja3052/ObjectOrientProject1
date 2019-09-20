public class Hippo extends Pachyderm{

	// CONSTRUCTOR

	// call super class constructor with the hippo's name
	public Hippo(String name){
		super(name);
	}

	// METHODS

	// each hippo eats the same way
	public void eat(String food){
		if (!this.is_sleep) {
			System.out.println(this.name + " the Hippo chomps the " + food + ".");
		}
	}

	// each hippo makes the same noise
	public void makeNoise(){
		if (!this.is_sleep) {
			System.out.println(this.name + " grunts.");
		}
	}

}