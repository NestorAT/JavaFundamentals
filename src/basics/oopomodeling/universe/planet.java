package basics.oopomodeling.universe;

public class planet extends celestialbody {

	private int age = 23;
	
	public planet(double mass, float radius, String name) {
		super(mass, radius, name);
		this.age = 45;
		
		//necesitamos crear al padre antes de cambiar propiedades creadas en planeta
	}

public planet() {
		
		super();
	}

//
	
	
}
