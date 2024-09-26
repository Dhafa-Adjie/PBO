package if2a;

public class BelajarExceptionH_mda {

	public static void main(String[] args) {
//		int angka = 0 ;
//		try {
//			angka = 1;
//		} catch (Exception e) {
//			angka = 2;
//		}
//		finally {
//			angka = 3;
//		}
//		
//		System.out.println(angka);  OUTPUT == 3
		
		
//		int angka = 0;
//		
//		try {
//			angka = 1;
//		} catch (Exception e) {
//			angka = 2;
//		} 
//
//		System.out.println(angka); OUTPUT == 1
		
		
//		int angka = 0;
//		
//		try {
//			angka = Integer.parseInt("1");
//		} catch (Exception e) {
//			angka = 2;
//		} 
//
//		System.out.println(angka);	OUTPUT == 1
		
		
//		int angka = 0;
//		
//		try {
//			angka = Integer.parseInt("satu");
//		} catch (Exception e) {
//			angka = 2;
//			System.out.println(e);
//		} 
//
//		System.out.println(angka);		OUTPUT == 2 , KARENA SATU TIDAK BISA DIUBAH KE INT
		
		int angka[] = new int[5];
		try {
			angka[5] = 10/0;
		}  catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("-- Selesai --");
	}

}
