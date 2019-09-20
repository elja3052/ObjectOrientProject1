public class Cat extends Feline {

    // CONSTRUCTOR

    // call super class constructor with the cat's name
    public Cat(String name) {
        super(name);
    }

    // METHODS

    // cat can only eat when awake
    public void eat(String food) {
        if (!this.is_sleep) {
            System.out.println(this.name + " the cat megerly nibbles on the " + food + ".");
        }
    }

    // can can only make noise when awake
    public void makeNoise() {
        if (!this.is_sleep) {
            System.out.println(this.name + " meows.");
        }
    }
}