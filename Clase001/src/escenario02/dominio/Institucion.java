package escenario02.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
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
	
	private Estudiante crearEstudiante() {
		Estudiante nuevoEstudiante = new Estudiante();
		nuevoEstudiante.setIdEstudiante(UUID.randomUUID());
		System.out.println("Ingrese nombre del estudiante: ");
		nuevoEstudiante.setNombre(IngresoPorScanner.entradaDeTexto());
		System.out.println("Fecha de Nacimiento: \ndía: ");
		int dia = IngresoPorScanner.entradaDeNumero();
		System.out.println("mes: ");
		int mes = IngresoPorScanner.entradaDeNumero();
		System.out.println("año: ");
		int anio = IngresoPorScanner.entradaDeNumero();
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		nuevoEstudiante.setFechaDeNacimiento(fecha);
		System.out.println("Ingrese DNI del estudiante: ");
		nuevoEstudiante.setDni(IngresoPorScanner.entradaDeNumeroLong());
		System.out.println("\nEstudiante ingresado con éxito.\n");
		System.out.println("NOMBRE: "+nuevoEstudiante.getNombre()+"\nID: "+nuevoEstudiante.getIdEstudiante()+"\nFECHA DE NACIMIENTO: "+
		nuevoEstudiante.getFechaDeNacimiento().getDayOfMonth()+"/"+nuevoEstudiante.getFechaDeNacimiento().getMonth()+"/"+
				nuevoEstudiante.getFechaDeNacimiento().getYear()+"\n");
		return nuevoEstudiante;
	}
	
	public void inscribirEstudiante(UUID idCurso) {
		Estudiante estudiante = crearEstudiante();
		boolean existeCurso = Boolean.FALSE;
		for(Curso curso : this.cursos) {
			if(curso.getIdCurso().equals(idCurso)) {
				estudiante.getCursos().add(curso);
				curso.getEstudiantes().put(estudiante.getDni(), estudiante);
				existeCurso = Boolean.TRUE;
				break;
			}
		}
		if(existeCurso) {
			System.out.println("Estudiante registrado.");
		}
	}
	
	public void mostrarCursos() {
		System.out.println("Lista de cursos disponibles");
		for(Curso curso : this.cursos) {
			System.out.println(curso.toString());
		}
	}
	
	public void inscribirEstudianteACurso(UUID idCurso, Long dni) {
		Estudiante estudiante = null;
		boolean existeElEstudiante = Boolean.FALSE;
		boolean esCursoEncontrado = Boolean.FALSE;
		for(Curso curso : cursos) {
			if(curso.getEstudiantes().containsKey(dni)) {
				estudiante = curso.getEstudiantes().get(dni);
				existeElEstudiante = Boolean.TRUE;
				break;
			}
		}
		if(!existeElEstudiante) {
			throw new NoSuchElementException("No existe el estudiante.");
		}
		for(Curso curso : cursos) {
			if(curso.getIdCurso().equals(idCurso)) {
				estudiante.getCursos().add(curso);
				curso.getEstudiantes().put(estudiante.getDni(), estudiante);
				esCursoEncontrado = Boolean.TRUE;
				break;
			}
		}
		if(!esCursoEncontrado) {
			throw new NoSuchElementException("No existe el curso.");
		}else {
			System.out.println("Estudiante asignado al curso.");
		}
	}
	
	public void listarEstudiantesYCursos() {
		Set<Estudiante> listasEstudiantesSinRepetir = new HashSet<>();
		for(Curso curso : cursos) {
			listasEstudiantesSinRepetir.addAll(curso.getEstudiantes().values());
		}
		ArrayList<Estudiante> listaEstudiante = new ArrayList<>(listasEstudiantesSinRepetir);
		System.out.println("Estudiantes:");
		for(Estudiante estudiante : listaEstudiante) {
			System.out.println(estudiante.toString());
			for(Curso curso : estudiante.getCursos()) {
				System.out.println(curso.toString());
			}
		}
	}

}
