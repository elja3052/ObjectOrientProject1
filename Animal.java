public abstract class Animal {

	// MEMBERS
	protected Boolean is_sleep;
	public String name;


	// CONSTRUCTOR
	public Animal(String name){
		this.name = name
	}


	// METHODS
	public void sleep() {
		if (!this.is_sleep){
			this.is_sleep = True;
		}
	}

	public void wakeup() {
		if (this.is_sleep){
			this.is_sleep = False;
		}
	}

	public abstract void eat(String food);

	public abstract void roam();

	public abstract void makeNoise();
}