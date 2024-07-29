package clase005.poo.escenario1.dominio;

public class Perro extends Animal {

	public Perro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerSonido() {
		System.out.println("Ladrar");
		
	}
	
	

}
