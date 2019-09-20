import java.util.*;

public abstract class Feline extends Animal {

    public Feline(String name) {
        super(name);
    }

    public void roam() {

        if (!this.is_sleep) {

            ArrayList<String> behaviors = new ArrayList<String>(
                    Arrays.asList(
                            this.name + "," + " the feline paces around...",
                            this.name + "," + " the feline stretches.",
                            this.name + "," + " the feline chases its tail.",
                            this.name + "," + " the feline plays with a toy."
                    ));

            // Reference used: Stephen Ostermiller on Stack Overflow
            // https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array
            Random rand = new Random();

            String rand_behavior = behaviors.get(rand.nextInt(behaviors.size()));

            System.out.println(rand_behavior);
        }
    }
}