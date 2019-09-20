public class Rhino extends Pachyderm{

	public Rhino(String name){
		super(name);
	}

	public void eat(String food){
		System.out.println(this.name + " the Rhino lightly " + food + " with its trunk");
	}

	public void makeNoise(){
		System.out.println(this.name + " trumpets its trunk");
	}

}