
public class Hangar {

	public static void main(String[] args) {
		
		Car bmw = new Car("wolkswagen");
		Boat bateau = new Boat("yacht");

		System.out.println(bmw.doStuff());
		System.out.println(bateau.doStuff());
	}

}
