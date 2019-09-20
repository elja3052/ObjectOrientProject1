import Zookeeper;
import Dog;
import Wolf;
import Cat;
import Lion;
import Rhino;
import Elephant;
import Hippo;

public class Zoo {

	private List<Animal> animals = new ArrayList<Animal>();

	private Zookeeper keeper;

	public Zoo() {
		Dog dog1 = new Dog("Doug");
		this.animals.add(dog1);
		Dog dog2 = new Dog("Dimmadome");
		this.animals.add(dog2);
		Wolf wolf1 = new Wolf("Warren");
		this.animals.add(wolf1);
		Wolf wolf2 = new Wolf("Wally");
		this.animals.add(wolf2);
		Cat cat1 = new Cat("Carly");
		this.animals.add(cat1);
		Cat cat2 = new Cat("Courtney");
		this.animals.add(cat2);
		Lion lion1 = new Lion("Leo");
		this.animals.add(lion1);
		Lion lion2 = new Lion("Leopold");
		this.animals.add(lion2);
		Rhino rhino1 = new Rhino("Raleigh");
		this.animals.add(rhino1);
		Rhino rhino2 = new Rhino("Rory");
		this.animals.add(rhino2);
		Rhino rhino3 = new Rhino("Reginald");
		this.animals.add(rhino3);
		Elephant elephant1 = new Elephant("Ellie");
		this.animals.add(elephant1);
		Elephant elephant2 = new Elephant("Earl");
		this.animals.add(elephant2);
		Hippo hippo1 = new Hippo("Holly");
		this.animals.add(hippo1);
		Hippo hippo2 = new Hippo("Harry");
		this.animals.add(hippo2);

		this.keeper = new Zookeeper(this.animals);
	}

	public static void main(){
		this.keeper.doJob();
	}

}