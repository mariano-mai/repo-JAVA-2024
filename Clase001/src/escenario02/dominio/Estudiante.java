package escenario02.dominio;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class Estudiante {
	
	private UUID idEstudiante;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private Long dni;
	private List<Curso> cursos;
	private Map<UUID, Examen> examenes = new TreeMap<>();

}
