import java.util.*;

public class Zoo {

	// this list will have each animal present in the zoo
	private List<Animal> animals = new ArrayList<Animal>();

	private Zookeeper keeper;

	// Constructor - instantiate each animal and add it to the list
	public Zoo() {
		this.animals.add(new Dog("Doug"));
		this.animals.add(new Dog("Dimmadome"));
		this.animals.add(new Wolf("Warren"));
		this.animals.add(new Wolf("Wally"));
		this.animals.add(new Cat("Carly"));
		this.animals.add(new Cat("Courtney"));
		this.animals.add(new Lion("Leo"));
		this.animals.add(new Lion("Leopold"));
		this.animals.add(new Rhino("Raleigh"));
		this.animals.add(new Rhino("Rory"));
		this.animals.add(new Rhino("Reginald"));
		this.animals.add(new Elephant("Ellie"));
		this.animals.add(new Elephant("Earl"));
		this.animals.add(new Hippo("Holly"));
		this.animals.add(new Hippo("Harry"));

		// zookeeper is created and given a list off all the animals
		this.keeper = new Zookeeper(this.animals);
	}

	// on a day at the zoo, the zookeeper wakes and tends to all the animals - that's his job
	public void simulateZooDay() {
		this.keeper.doJob();
	}


	public static void main(String[] args){
		// create the zoo
		Zoo zoo = new Zoo();

		// simulate a single zoo day for the animals
		zoo.simulateZooDay();
	}

}