package clase005.poo.escenario1.dominio;

public class Gato extends Animal {
	
	/*public Gato(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}*/

	private String raza;
	

	public Gato(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void hacerSonido() {
		System.out.println("Maullar");
		
	}
	
	

}
