public class Elephant extends Pachyderm{

	public Elephant(String name){
		super(name);
	}

	public void eat(String food){
		System.out.println(this.name + " the Elephant shlurps up the " + food + " with its trunk");
	}

	public void makeNoise(){
		System.out.println(this.name + " trumpets its trunk");
	}

}