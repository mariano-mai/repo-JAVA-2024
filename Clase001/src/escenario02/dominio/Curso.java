package escenario02.dominio;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import escenario02.enumerators.NivelDeDificultad;

public class Curso {
	
	private String nombre;
	private int cantidadDeHoras;
	private NivelDeDificultad nivelDeDificultad;
	private List<Examen> examenes;
	private Map<UUID, Estudiante> estudiantes = new TreeMap<>();
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(String nombre, int cantidadDeHoras, NivelDeDificultad nivelDeDificultad, List<Examen> examenes,
			Map<UUID, Estudiante> estudiantes) {
		super();
		this.nombre = nombre;
		this.cantidadDeHoras = cantidadDeHoras;
		this.nivelDeDificultad = nivelDeDificultad;
		this.examenes = examenes;
		this.estudiantes = estudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}

	public void setCantidadDeHoras(int cantidadDeHoras) {
		this.cantidadDeHoras = cantidadDeHoras;
	}

	public NivelDeDificultad getNivelDeDificultad() {
		return nivelDeDificultad;
	}

	public void setNivelDeDificultad(NivelDeDificultad nivelDeDificultad) {
		this.nivelDeDificultad = nivelDeDificultad;
	}

	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}

	public Map<UUID, Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Map<UUID, Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	

}
