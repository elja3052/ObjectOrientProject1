public abstract class Canine extends Animal{

		public Canine(String name){
			super(name);
		}

		public void roam(){
			System.out.println(this.name + " the Canine walks leisurely on four legs");
		}
}