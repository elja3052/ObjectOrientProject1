public class Dog extends Canine{

	public Dog(String name){
		super(name);
	}

	public void eat(String food){
		System.out.println(this.name.concat(" the Dog eagerly scarfs up the ").concat(food));
	}

	public void makeNoise(){
		System.out.println(this.name + " barks in a friendly manner");
	}

}