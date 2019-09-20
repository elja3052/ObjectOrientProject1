import java.util.*;

public class Zookeeper {

	// MEMBERS

	// list represents each animal the zookeeper will tend to
	private List<Animal> animals;

	// CONSTRUCTOR

	// zookeeper must be constructed with a list of Animals
	public Zookeeper(List<Animal> animals){
		this.animals = animals;
	}

	// METHODS

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

	// each animal makes noise
	private void rollCall(){
		System.out.println("\nThe zookeeper calls roll...");
		for(Animal animal : this.animals){
			animal.makeNoise();
		}
	}

	// each animal is fed by the zookeeper
	private void feedAnimals(){
		System.out.println("\nThe zookeeper proceeds to feed the animals...");
		for(Animal animal : this.animals){

			// budget is tight at the zoo - thankfully all the animals like bread
			animal.eat("bread");
		}
	}

	// each animal roams around
	private void exerciseAnimals(){
		System.out.println("\nThe zookeeper exercises the animals...");
		for(Animal animal : this.animals){
			animal.roam();
		}
	}

	// each animal goes to sleep at the end of the day
	private void shutDownZoo(){
		System.out.println("\nThe zookeeper now shuts down the zoo...");
		for(Animal animal : this.animals){
			animal.sleep();
		}
	}

}