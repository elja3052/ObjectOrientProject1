import Pachyderm;
import java.io.*

public class Elephant extends Pachyderm{

	public Pachyderm(String name){
		super(name);
	}

	@Override
	public void eat(String food){
		System.out.println(this.name + " the Elephant shlurps up the " + food + " with its trunk");
	}

	@Override
	public void makeNoise(){
		System.out.println(this.name + " trumpets its trunk");
	}

}