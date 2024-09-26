package view;

public class Layar2 {	
	public static void main(String[] args) {
		String input = "Rp.200000";

        // Mengambil substring yang hanya berisi nominal
        String nominalString = input.substring(3);

        // Mengubah substring ke dalam tipe data int
        int nominal = Integer.parseInt(nominalString);

        // Menampilkan hasil
        System.out.println(nominal);
	}
}
