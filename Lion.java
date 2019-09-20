public class Lion extends Feline {

    // CONSTRUCTOR

    // call super class constructor with the lion's name
    public Lion(String name) {
        super(name);
    }

    // METHODS

    // can only eat when awake - each lion eats the same way
    public void eat(String food) {
        if (!this.is_sleep) {
            System.out.println(this.name + " the lion tears the " + food + " to shreds.");
        }
    }

    // can only make noise when awake - each lion makes the same noise
    public void makeNoise() {
        if (!this.is_sleep) {
            System.out.println(this.name + " roars menacingly.");
        }
    }
}