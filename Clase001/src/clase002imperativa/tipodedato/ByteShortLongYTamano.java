package clase002imperativa.tipodedato;

public class ByteShortLongYTamano {

	public static void main(String[] args) {
		
		System.out.println("Rango de byte: "+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);
		byte minValue = -128;
		byte maxValue = 127;
		
		System.out.println("Rango de short: "+Short.MIN_VALUE+" - "+Short.MAX_VALUE);
		short minValueShort = -32768;
		short maxValueShort = 32767;
		
		System.out.println("Rango de int: "+Integer.MIN_VALUE+" - "+Integer.MAX_VALUE);
		int minValueInt = -2147483648;
		int maxValueInt = 2147483647;
		
		System.out.println("Rango de long: "+Long.MIN_VALUE+" - "+Long.MIN_VALUE);
		long valueLong = 2147483647L;
		
		final long SCREAMER_CAMEL_CASE = 2147483647;

	}

}
