import Pachyderm;
import java.io.*

public class Hippo extends Pachyderm{

	public Pachyderm(String name){
		super(name);
	}

	@Override
	public void eat(String food){
		System.out.println(this.name + " the Hippo chomps the " + food);
	}

	@Override
	public void makeNoise(){
		System.out.println(this.name + " grunts");
	}

}