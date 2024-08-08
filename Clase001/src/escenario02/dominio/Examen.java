package escenario02.dominio;

import java.util.UUID;

public class Examen {
	
	private UUID idExamen;
	private Curso curso;
	private Estudiante estudiante;
	private Double calificacion;
	private String descripcionDeCalificacion;
	
	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Examen(UUID idExamen, Curso curso, Estudiante estudiante, Double calificacion,
			String descripcionDeCalificacion) {
		super();
		this.idExamen = idExamen;
		this.curso = curso;
		this.estudiante = estudiante;
		this.calificacion = calificacion;
		this.descripcionDeCalificacion = descripcionDeCalificacion;
	}

	public UUID getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(UUID idExamen) {
		this.idExamen = idExamen;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public String getDescripcionDeCalificacion() {
		return descripcionDeCalificacion;
	}

	public void setDescripcionDeCalificacion(String descripcionDeCalificacion) {
		this.descripcionDeCalificacion = descripcionDeCalificacion;
	}
	

}
