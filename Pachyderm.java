public abstract class Pachyderm extends Animal{

		// CONSTRUCTOR

		// call super class constructor with the pachyderm's name
		public Pachyderm(String name){
			super(name);
		}

		// METHODS

		// each pachyderm roams in the same fashion
		public void roam(){
			if (!this.is_sleep) {
				System.out.println(this.name + " the Pachyderm walks with immense weight.");
			}
		}

}