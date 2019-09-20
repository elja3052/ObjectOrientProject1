import java.io.*

public abstract class Animal {

	// MEMBERS
	protected Boolean is_sleep;
	public String name;


	// CONSTRUCTOR
	public Animal(String name){
		this.name = name;
	}


	// METHODS
	public void sleep() {
		if (!this.is_sleep){
			System.out.println(this.name + " goes to sleep.")
			this.is_sleep = True;
		}
		else {
			System.out.println(this.name + " is already asleep!")
		}
	}

	public void wakeup() {
		if (this.is_sleep){
			System.out.println(this.name + " wakes up.")
			this.is_sleep = False;
		}
		else {
			System.out.println(this.name + " is already asleep!")
		}
	}

	public abstract void eat(String food);

	public abstract void roam();

	public abstract void makeNoise();
}