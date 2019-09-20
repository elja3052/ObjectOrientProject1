

import java.io.*;
import java.uitl.*;

public abstract class Feline extends Animal {

    ArrayList<String> behaviors = new ArrayList<String>(
            Arrays.asList(
                    this.name + "," + " the feline paces around...",
                    this.name + "," + " the feline stretches.",
                    this.name + "," + " the feline chases its tail.",
                    this.name + "," + " the feline plays with a toy."
            ));

    public Feline(String name) {
        super(name);
    }

    @Override
    public void roam() {

        if (!this.is_sleep) {
            Random rand = new Random();

            String rand_behavior = this.behaviors[rand.nextInt(behaviors.length)];

            System.out.println(rand_behavior);
        }
    }
}