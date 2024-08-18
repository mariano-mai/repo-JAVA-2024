package buscapersonas.util;

import java.util.Scanner;

public class IngresoPorScanner {
	
	static Scanner entrada;
	
	public static String entradaDeTexto() {
		entrada = new Scanner(System.in);
		String texto = entrada.nextLine();
		return texto;
	}
	
	public static int entradaDeNumero() {
		entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		return numero;
	}
	
	public static Long entradaDeNumeroLong() {
		entrada = new Scanner(System.in);
		Long numero = entrada.nextLong();
		return numero;
	}
	
	public static boolean esONoEs(int valor) {
		boolean estaHabilitado;
		if(valor == 1) {
			estaHabilitado = true;
		}else {
			estaHabilitado = false;
		}
		return estaHabilitado;
	}

}
