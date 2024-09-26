package if2a;

public class BljrDebuggging_MDa {

	public static void main(String[] args) {
		int angkaPertama = 10;
       	int angkaKedua = 20;
       	
       	int tambah = angkaPertama + angkaKedua;
       	
       	System.out.println("hasil penambahan = " + tambah);
       	
       	penambahan(angkaPertama, angkaKedua);
       	pengurangan(angkaPertama, angkaKedua);
 	}
 	
 	public static void penambahan(int a, int b) {
       	int hasil = a + b;
       	System.out.println("Hasil = " + hasil );
 	}
 	
 	public static void pengurangan(int a, int b) {
       	int hasil = a - b;
       	System.out.println("Hasil = " + hasil );
 	}
}
