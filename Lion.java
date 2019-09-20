public class Lion extends Feline {

    // call super class constructor with the lion's name
    public Lion(String name) {
        super(name);
    }

    // can only eat when awake
    public void eat(String food) {
        if (!this.is_sleep) {
            System.out.println(this.name + " the lion tears the " + food + " to shreds.");
        }
    }

    // can only make noise when awake
    public void makeNoise() {
        if (!this.is_sleep) {
            System.out.println(this.name + "roars menacingly.");
        }
    }
}