package javajedi2024.poo.iniciado;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String nombre;
	private boolean estaHabilitado;
	private String descripcion;
	private List<Alumno> alumnos = new ArrayList<>();
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(String nombre, boolean estaHabilitado, String descripcion, List<Alumno> alumnos) {
		super();
		this.nombre = nombre;
		this.estaHabilitado = estaHabilitado;
		this.descripcion = descripcion;
		this.alumnos = alumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstaHabilitado() {
		return estaHabilitado;
	}

	public void setEstaHabilitado(boolean estaHabilitado) {
		this.estaHabilitado = estaHabilitado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}
