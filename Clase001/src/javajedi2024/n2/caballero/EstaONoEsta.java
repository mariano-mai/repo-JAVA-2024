package javajedi2024.n2.caballero;

public class EstaONoEsta {

	public static void main(String[] args) {
		
		int[] valores = {1,54,44,2,98,6,15};
		
		int buscador = 54;
		int posicion = 0;
		boolean bandera = false;
		
		for(int i=0; i<valores.length; i++) {
			if(valores[i]==buscador) {
				bandera = true;
				posicion = i;
			}
		}
		if(bandera) {
			System.out.println("El valor "+valores[posicion]+" se encuentra en la posición "+posicion);
		}else {
			System.out.println("El valor no se encuentra en el arreglo.");
		}

	}

}
