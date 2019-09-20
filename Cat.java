public class Cat extends Feline {

    public Cat(String name) {
        super(name);
    }

    public void eat(String food) {
        if (!this.is_sleep) {
            System.out.println(this.name + "," + " the cat megerly nibbles on the " + food + ".");
        }
    }

    public void makeNoise() {
        if (!this.is_sleep) {
            System.out.println(this.name + "," + "meows.");
        }
    }
}