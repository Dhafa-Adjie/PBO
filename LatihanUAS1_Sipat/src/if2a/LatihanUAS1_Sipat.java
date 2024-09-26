package if2a;

import java.util.ArrayList;

import model.Mahasiswa;
import view.LayarInput;

public class LatihanUAS1_Sipat {

	private static ArrayList<Mahasiswa> arrayMahasiswa = new ArrayList<Mahasiswa>();
	 
	/** method untuk menginputkan satu data mahasiswa ke dalam arraylist
	 * parameter : objek Mahasiswa 
	 */
	public static void inputSatuMahasiswa(Mahasiswa objekMahasiswa) {
		arrayMahasiswa.add(objekMahasiswa);
	}
	
	public static ArrayList<Mahasiswa> getDataMahasiswa() {
		return arrayMahasiswa;
		
	}
	
	
	public static void main(String[] args) {
	
		LayarInput layarInput = new LayarInput();
	}

}
