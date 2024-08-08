package javajedi2024.poo.iniciado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javajedi2024.poo.iniciado.input.IngresoPorScanner;

public class App {

	public static void main(String[] args) {
		
		LocalDate fecha;
		
		Alumno alumno1 = new Alumno("Marcos", "Yrala", fecha=LocalDate.of(1999, 5, 22), 25);
		Alumno alumno2 = new Alumno("Mariano", "Maidana", fecha=LocalDate.of(1988, 4, 27), 36);
		Alumno alumno3 = new Alumno("Gisela", "Falcón", fecha=LocalDate.of(1993, 4, 26), 35);
		Alumno alumno4 = new Alumno("Franco", "Gallardo", fecha=LocalDate.of(2000, 11, 23), 24);
		Alumno alumno5 = new Alumno("Guillermo", "Lopez", fecha=LocalDate.of(2000, 5, 7), 24);
		Alumno alumno6 = new Alumno("Noelia", "Zacaríaz", fecha=LocalDate.of(1991, 3, 19), 33);
		Alumno alumno7 = new Alumno("Rita", "Stocchero", fecha=LocalDate.of(2000, 11, 23), 24);
		Alumno alumno8 = new Alumno("Agustín", "Maidana", fecha=LocalDate.of(1990, 10, 10), 34);
		Alumno alumno9 = new Alumno("Edgardo", "Gonzalez", fecha=LocalDate.of(1988, 10, 1), 36);
		Alumno alumno10 = new Alumno("Franco", "Arévalo", fecha=LocalDate.of(2002, 1, 23), 22);
		
		//Alumno ingresado por pantalla
		System.out.println("Ingrese datos del alumno Scanner:");
		System.out.println("Nombre:");
		String nombreScanner = IngresoPorScanner.entradaDeTexto();
		System.out.println("Apellido:");
		String apellidoScanner = IngresoPorScanner.entradaDeTexto();
		System.out.println("Fecha de nacimiento: ");
		System.out.println("Día:");
		int diaScanner = IngresoPorScanner.entradaDeNumero();
		System.out.println("Mes (número): ");
		int mesScanner = IngresoPorScanner.entradaDeNumero();
		System.out.println("Año:");
		int anioScanner = IngresoPorScanner.entradaDeNumero();
		fecha=LocalDate.of(anioScanner, mesScanner, diaScanner);
		System.out.println("Edad:");
		int edadScanner = IngresoPorScanner.entradaDeNumero();
		Alumno alumnoScanner = new Alumno(nombreScanner, apellidoScanner, fecha, edadScanner);
		
		
		Alumno[] listaDeAlumnos = {alumno1, alumno2, alumno3, alumno4, alumno5, alumno6, alumno7, alumno8, alumno9, alumno10, alumnoScanner};
		
		List<Alumno> listaDeAlumnos2 = new ArrayList<>();
		for(Alumno alumno : listaDeAlumnos) {
			listaDeAlumnos2.add(alumno);
		}
		
		for(Alumno alumno : listaDeAlumnos) {
			System.out.println("NOMBRE: "+alumno.getNombre());
			System.out.println("APELLIDO: "+alumno.getApellido());
			System.out.println("FECHA DE NACIMIENTO: "+alumno.getFechaDeNacimiento().getDayOfMonth()+"/"+alumno.getFechaDeNacimiento().getMonth()+"/"+alumno.getFechaDeNacimiento().getYear());
			System.out.println("EDAD: "+alumno.getEdad());
			System.out.println("");
		}
		
		Curso curso1 = new Curso("Matemática 1", true, "Es un curso básico de matemática.", new ArrayList<>());
		Curso curso2 = new Curso("Historia 1", false, "Sin información.", new ArrayList<>());
		Curso curso3 = new Curso("Ciencias Naturales", true, "Es un curso básico de ciencias naturales.", new ArrayList<>());
		
		//Curso ingresado por pantalla
		System.out.println("Ingrese datos del curso Scanner:");
		System.out.println("Nombre del curso:");
		String nombreCurso = IngresoPorScanner.entradaDeTexto();
		System.out.println("Si el curso está habilitado ingrese 1");
		boolean habilitado = IngresoPorScanner.esONoEs(IngresoPorScanner.entradaDeNumero());
		System.out.println("Descripción del curso:");
		String descripcionCurso = IngresoPorScanner.entradaDeTexto();
		Curso cursoScanner = new Curso(nombreCurso, habilitado, descripcionCurso, new ArrayList<>());
		
		Curso[] listaDeCursos = {curso1, curso2, curso3, cursoScanner};
		List<Curso> cursos = new ArrayList<>();
		for(Curso curso : listaDeCursos) {
			cursos.add(curso);
		}
		for(Curso curso : cursos) {
			for(int i=0; i<=3; i++) {
				int min = 0;
				int max = 10;
				int random = min + (int)(Math.random() * ((max - min) + 1));
				curso.getAlumnos().add(listaDeAlumnos2.get(random));
			}
		}
		
		for(Curso curso : listaDeCursos) {
			System.out.println("NOMBRE DEL CURSO: "+curso.getNombre());
			System.out.println("DESCRIPCIÓN: "+curso.getDescripcion());
			System.out.println("Lista de Alumnos:");
			for(Alumno alumno : curso.getAlumnos()) {
				System.out.println("- "+alumno.getApellido()+", "+alumno.getNombre());
			}
			System.out.println("");
		}

	}

}
