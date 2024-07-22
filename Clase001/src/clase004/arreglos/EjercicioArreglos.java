package clase004.arreglos;

public class EjercicioArreglos {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4};
		
		for(int i=0; i<array.length; i++) {
			if(i!=0 && i!=3) {
				System.out.println(array[i]);
			}
		}

	}

}
