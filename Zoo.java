import java.util.*;

public class Zoo {

	private List<Animal> animals = new ArrayList<Animal>();

	private Zookeeper keeper;

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

		this.keeper = new Zookeeper(this.animals);
	}

	public void simulateZooDay() {
		this.keeper.doJob();
	}

	public static void main(String[] args){
		Zoo zoo = new Zoo();
		zoo.simulateZooDay();
	}

}