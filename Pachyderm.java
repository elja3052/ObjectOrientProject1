import Animal.Animal
import java.io.*

public abstract class Pachyderm extends Animal{

		public Pachyderm(String name){
			super(name);
		}

		public void roam(){
			System.out.println(this.name + " the Pachyderm walks with immense weight");
		}

}