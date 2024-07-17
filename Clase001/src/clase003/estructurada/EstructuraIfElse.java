package clase003.estructurada;

public class EstructuraIfElse {

	public static void main(String[] args) {
		
		int topPuntaje = 99;
		
		//Condicional Simple
		if(topPuntaje < 100) {
			System.out.println("Puntaje: "+topPuntaje);
		}
		System.out.println("Fuera del if");
		
		//Condicional Doble
		int segundoPuntaje = 90;
		
		if(topPuntaje > segundoPuntaje && topPuntaje <= 100) {
			System.out.println("Se cumple.");
		}else {
			System.out.println("No se cumple.");
		}

	}

}
