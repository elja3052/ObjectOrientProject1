public abstract class Canine extends Animal{

		// CONSTRUCTOR

		// call super class constructor with the canine's name
		public Canine(String name){
			super(name);
		}

		// METHODS

		// each canine roams the same way
		public void roam(){
			if (!this.is_sleep) {
				System.out.println(this.name + " the Canine walks leisurely on four legs.");
			}
		}
}