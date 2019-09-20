
import java.io.*;

public class Lion extends Feline {

    public Lion(String name) {
        super(name);
    }

    public void eat(String food) {
        if (!this.is_sleep) {
            System.out.println(this.name + "," + " the lion tears the " + food + " to shreds.");
        }
    }

    public void makeNoise() {
        if (!this.is_sleep) {
            System.out.println(this.name + "," + "roars menacingly.");
        }
    }
}