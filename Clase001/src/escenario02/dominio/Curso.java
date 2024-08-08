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

}
