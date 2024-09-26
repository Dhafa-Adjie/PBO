package if2a;

public class Debug_mda {
	public static void main(String [] args) {
		int angkaPertama = 10;
       	int angkaKedua = 20;
       	
        String keterangan = "informasi";
        if (angkaPertama>angkaKedua) {
            keterangan = "angka pertama lebih besar dari kedua";
        }else if (angkaPertama == 0) {
            keterangan = "angka pertama adalah bilangan nol";
        }else if (angkaKedua == 0) {
            keterangan = "angka kedua adalah bilangan nol";
        }else if (angkaPertama<angkaKedua)  {
            keterangan = "angka pertama lebih kecil dari kedua";
        }else {
            keterangan = "angka pertama sama dengan kedua";
        }
        System.out.println(keterangan);

	}
}
