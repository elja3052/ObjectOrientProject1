public class Rhino extends Pachyderm{

	public Rhino(String name){
		super(name);
	}

	public void eat(String food){
		System.out.println(this.name + " the Rhino impales the  " + food + " with its tusk before eating it.");
	}

	public void makeNoise(){
		System.out.println(this.name + " makes a low growl.");
	}

}