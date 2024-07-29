package clase005.poo.escenario1.dominio;

import java.util.List;

public class Zoologico {
	
	private List<Animal> animales;

	public Zoologico(List<Animal> animales) {
		super();
		this.animales = animales;
	}

	public List<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	
	

}
