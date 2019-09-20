import java.util.*;

public class Zookeeper {

	// list represents each animal the zookeeper will tend to
	private List<Animal> animals;

	// zookeeper must be constructed with a list of Animals
	public Zookeeper(List<Animal> animals){
		this.animals = animals;
	}

	// public method for the zookeeper - simulates daily animal interaction
	public void doJob(){
		this.wakeAnimals();
		this.rollCall();
		this.feedAnimals();
		this.exerciseAnimals();
		this.shutDownZoo();
	}

	// wake each animal up
	private void wakeAnimals(){
		System.out.println("The zookeeper goes to wake the animals...");
		for(Animal animal : this.animals){
			animal.wakeup();
		}
	}

	private void rollCall(){
		System.out.println("The zookeeper calls roll...");
		for(Animal animal : this.animals){
			animal.makeNoise();
		}
	}

	private void feedAnimals(){
		System.out.println("The zookeeper proceeds to feed the animals...");
		for(Animal animal : this.animals){
			animal.eat("bread");
		}
	}

	private void exerciseAnimals(){
		System.out.println("The zookeeper exercises the animals...");
		for(Animal animal : this.animals){
			animal.roam();
		}
	}

	private void shutDownZoo(){
		System.out.println("The zookeeper now shuts down the zoo");
		for(Animal animal : this.animals){
			animal.sleep();
		}
	}

}