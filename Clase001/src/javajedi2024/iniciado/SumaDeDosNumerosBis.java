package javajedi2024.iniciado;

public class SumaDeDosNumerosBis {

	public static void main(String[] args) {
		int num1=4, num2=7, suma;
		suma = num1+num2;
		
		String paridad = (suma%2==0)?"par." : "impar";
		
		System.out.println("El resultado es "+suma+" y es "+paridad);

	}

}
