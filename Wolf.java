public class Wolf extends Canine{

	public Wolf(String name){
		super(name);
	}

	public void eat(String food){
		System.out.println(this.name + " the Wolf eagerly snarfs down the " + food);
	}

	public void makeNoise(){
		System.out.println(this.name + " howls into the sky");
	}

}