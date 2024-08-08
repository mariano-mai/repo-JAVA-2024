package escenario02.dominio;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import escenario02.enumerators.NivelDeDificultad;

public class CursoPractico extends Curso{
	
	private List<Recurso> recursos;

	public CursoPractico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CursoPractico(String nombre, int cantidadDeHoras, NivelDeDificultad nivelDeDificultad, List<Examen> examenes,
			Map<UUID, Estudiante> estudiantes) {
		super(nombre, cantidadDeHoras, nivelDeDificultad, examenes, estudiantes);
		// TODO Auto-generated constructor stub
	}

	public CursoPractico(List<Recurso> recursos) {
		super();
		this.recursos = recursos;
	}

	public List<Recurso> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}
	

}
