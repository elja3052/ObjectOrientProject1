public abstract class Animal{

	// MEMBERS
	protected Boolean is_sleep;

	public String name;


	// CONSTRUCTOR
	public Animal(String name){
		this.name = name;
		this.is_sleep = true;
	}


	// METHODS
	public void sleep() {

		// animal can only go to sleep if it is awake
		if (!this.is_sleep){
			System.out.println(this.name + " goes to sleep.");
			this.is_sleep = true;
		}
		else {
			System.out.println(this.name + " is already asleep!");
		}
	}

	public void wakeup() {

		// animal can only wake up if it is asleep
		if (this.is_sleep){
			System.out.println(this.name + " wakes up.");
			this.is_sleep = false;
		}
		else {
			System.out.println(this.name + " is already asleep!");
		}
	}

	// eat is implemented at the second subclass level
	public abstract void eat(String food);

	// roam is implemented at the first subclass level
	public abstract void roam();

	// makeNoise is implemented at the second subclass level
	public abstract void makeNoise();
}