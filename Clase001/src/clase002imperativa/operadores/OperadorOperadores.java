package clase002imperativa.operadores;

public class OperadorOperadores {

	public static void main(String[] args) {
		
		int resultado = 5 + 3 * 2;
		int resultado2 = 20 / 4 * 2 + 3;
		
		int resultado3 = (resultado2>resultado)?1:0;
		System.out.println(resultado3);
		
		int value2;
		int value = 5;
		value2 = value++;
		System.out.println(value2);
		value2 = ++value;
		System.out.println(value2);
		value2 = --value;
		System.out.println(value2);

	}

}
