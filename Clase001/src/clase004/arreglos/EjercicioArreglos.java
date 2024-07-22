package clase004.arreglos;

public class EjercicioArreglos {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8};
		
		for(int i=0; i<array.length; i++) {
			if(i!=0 && i!=array.length-1) {
				System.out.println(array[i]);
			}
		}

	}

}
