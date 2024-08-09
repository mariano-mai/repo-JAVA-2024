package escenario02.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import escenario02.enumerators.NivelDeDificultad;
import escenario02.utilidades.input.IngresoPorScanner;

public class Institucion {
	
	private List<Curso> cursos = new ArrayList<>();

	public Institucion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institucion(List<Curso> cursos) {
		super();
		this.cursos = cursos;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	//Métodos
	public Curso crearCurso() {
		Curso nuevoCurso = new Curso();
		nuevoCurso.setIdCurso(UUID.randomUUID());
		System.out.println("Ingrese nombre del curso:");
		nuevoCurso.setNombre(IngresoPorScanner.entradaDeTexto());
		System.out.println("Ingrese nivel de dificultad del curso: \n1- Fácil. \n2- Medio. \n3- Difícil.");
		int complejidad = IngresoPorScanner.entradaDeNumero();
		nuevoCurso.setNivelDeDificultad(
				switch(complejidad) {
					case 1 -> NivelDeDificultad.FACIL;
					case 2 -> NivelDeDificultad.MEDIO;
					case 3 -> NivelDeDificultad.DIFICIL;
					default -> NivelDeDificultad.FACIL;
				});
		System.out.println("Ingrese cantidad de horas de cursado:");
		nuevoCurso.setCantidadDeHoras(IngresoPorScanner.entradaDeNumero());
		this.cursos.add(nuevoCurso);
		System.out.println("\nCurso creado con éxito.\n");
		System.out.println("NOMBRE: "+nuevoCurso.getNombre()+"\nID: "+nuevoCurso.getIdCurso()+"\nNIVEL DE DIFICULTAD: "+nuevoCurso.getNivelDeDificultad()+"\n");
		return nuevoCurso;
	}

}
