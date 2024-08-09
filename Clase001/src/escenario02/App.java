package escenario02;

import escenario02.dominio.Institucion;
import escenario02.utilidades.input.IngresoPorScanner;

public class App {

	public static void main(String[] args) {
		
		int opcion;
		Institucion institucion = new Institucion();
		
		do {
			System.out.println("Ingrese opción:");
			System.out.println("1- Crear curso. \n"+
								"2- Registrar estudiante nuevo. \n"+
								"3- Registrar un estudiante existente. \n"+
								"4- Listar cursos. \n"+
								"5- Listar cursos y estudiantes. \n"+
								"6- Salir.");
			opcion = IngresoPorScanner.entradaDeNumero();
			
			switch(opcion) {
				case 1:
					institucion.crearCurso();
			}
		}while(opcion != 6);

	}

}
