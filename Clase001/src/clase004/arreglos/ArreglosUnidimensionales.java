package clase004.arreglos;

public class ArreglosUnidimensionales {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7};
		
		System.out.println("Longitud del arreglo: "+array.length);
		System.out.println("Valor de posición 3: "+array[2]);
		
		int[] array2 = new int[6];
		System.out.println("Valor en posición 2: "+array2[1]);
		
		array[2]=100;
		System.out.println("Valor en posición 3: "+array[2]);
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Valor de posición "+(i+1)+": "+array[i]);
		}
		
		for(int i=array.length-1; i>=0; i--) {
			System.out.println("Valor de posición "+(i+1)+": "+array[i]);
		}

	}

}
