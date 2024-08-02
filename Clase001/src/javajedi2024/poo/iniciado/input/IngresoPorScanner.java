package javajedi2024.poo.iniciado.input;

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
	
	public static boolean esONoEs(int valor) {
		int valor1 = valor;
		boolean estaHabilitado;
		if (valor1 == 1) {
			estaHabilitado = true;
		}else {
			estaHabilitado = false;
		}
		return estaHabilitado;
	}

}
