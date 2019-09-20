import java.util.*;

public abstract class Feline extends Animal {

    protected ArrayList<String> behaviors;

    public Feline(String name) {

        // call the super class constructor with the feline's name
        super(name);

        // initalize list of behaviors
        this.behaviors = new ArrayList<String>(
                Arrays.asList(
                        this.name + "," + " the feline paces around.",
                        this.name + "," + " the feline stretches.",
                        this.name + "," + " the feline chases its tail.",
                        this.name + "," + " the feline plays with a toy."
                ));
    }

    public void roam() {

        // only performs actions when not asleep
        if (!this.is_sleep) {

            // Reference used: Stephen Ostermiller on Stack Overflow
            // https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array
            Random rand = new Random();

            // cat's perform a random action out of their list of behaviors
            String rand_behavior = this.behaviors.get(rand.nextInt(behaviors.size()));

            System.out.println(rand_behavior);
        }
    }
}