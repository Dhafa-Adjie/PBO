package if2a;

import java.util.ArrayList;

import model.Mahasiswa;
import view.LayarInput;

public class LatihanUAS1_MDA {
	
	private static ArrayList<Mahasiswa> arrayMhs = new ArrayList<Mahasiswa>();
	
	public static void inputDatamhs(Mahasiswa objekMahasiswa) {
		arrayMhs.add(objekMahasiswa);
	}
	/*Method untuk menginputkan satu data mahasiswa ke dalam ArrayList 
	 * Parameter : Objek Mahasiswa*/
	
	public static ArrayList<Mahasiswa> getDataMhs(){
		return arrayMhs;
	}/*Method yang mengembalikan nilai berupa ArrayList Mahasiswa*/
	
	public static void main(String[] args) {
		LayarInput layarI = new LayarInput(); 
		
	}

}
