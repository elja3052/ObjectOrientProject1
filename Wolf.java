import Canine;
import java.io.*

public class Wolf extends Canine{

	public Wolf(String name){
		super(name);
	}

	@Override
	public void eat(String food){
		System.out.println(this.name + " the Wolf eagerly snarfs down the " + food);
	}

	@Override
	public void makeNoise(){
		System.out.println(this.name + " howls into the sky");
	}

}