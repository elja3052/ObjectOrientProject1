public class Hippo extends Pachyderm{

	public Hippo(String name){
		super(name);
	}

	public void eat(String food){
		System.out.println(this.name + " the Hippo chomps the " + food + ".");
	}

	public void makeNoise(){
		System.out.println(this.name + " grunts.");
	}

}