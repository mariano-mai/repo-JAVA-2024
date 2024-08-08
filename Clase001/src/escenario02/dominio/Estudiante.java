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
	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(UUID idEstudiante, String nombre, LocalDate fechaDeNacimiento, Long dni, List<Curso> cursos,
			Map<UUID, Examen> examenes) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
		this.cursos = cursos;
		this.examenes = examenes;
	}

	public UUID getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(UUID idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Map<UUID, Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(Map<UUID, Examen> examenes) {
		this.examenes = examenes;
	}
	

}
