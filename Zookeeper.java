import java.util.*;

public class Zookeeper {

	private List<Animal> animals;

	public Zookeeper(List<Animal> animals){
		this.animals = animals;
	}

	public void doJob(){
		this.wakeAnimals();
		this.rollCall();
		this.feedAnimals();
		this.exerciseAnimals();
		this.shutDown();
	}

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

	private void shutDown(){
		System.out.println("The zookeeper now shuts down the zoo");
		for(Animal animal : this.animals){
			animal.sleep();
		}
	}

}