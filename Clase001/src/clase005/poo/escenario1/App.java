package clase005.poo.escenario1;

import java.util.ArrayList;
import java.util.List;

import clase005.poo.escenario1.dominio.Animal;
import clase005.poo.escenario1.dominio.Gato;
import clase005.poo.escenario1.dominio.Perro;
import clase005.poo.escenario1.dominio.Zoologico;

public class App {

	public static void main(String[] args) {
		
		Animal perro1 = new Perro("Norris", 8);
		Animal perro2 = new Perro("Chola", 7);
		Animal gato1 = new Gato("Micha", 6, "Carey");
		Animal gato2 = new Gato("Grey", 5, "Calle");
		
		List<Animal> animales = new ArrayList<>();
		animales.add(perro1);
		animales.add(perro2);
		animales.add(gato1);
		animales.add(gato2);
		
		Zoologico zoo1 = new Zoologico(animales);
		
		for(Animal animal : animales) {
			System.out.println(animal.getNombre());
			animal.hacerSonido();
		}

	}

}
