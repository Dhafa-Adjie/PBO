package if2a;

import java.util.ArrayList;
import model.Mahasiswa;
import model.ProgramStudi;
import view.LayarInput;

public class LatihanUAS2_Sipat {

    private static ArrayList<Mahasiswa> arrayMahasiswa = new ArrayList<>();

    public static void inputSatuMahasiswa(Mahasiswa objekMahasiswa) {
        arrayMahasiswa.add(objekMahasiswa);
    }

    public static ArrayList<Mahasiswa> getDataMahasiswa() {
        return arrayMahasiswa;
    }

    public static void main(String[] args) {
        // Membuat objek program studi
        ProgramStudi informatika = new ProgramStudi("Informatika", "Fakultas Ilmu Komputer", "Universitas ABC");
        ProgramStudi manajemen = new ProgramStudi("Manajemen", "Fakultas Ekonomi dan Bisnis", "Universitas MDP");
        ProgramStudi hukumBisnis = new ProgramStudi("Hukum Bisnis", "Fakultas Hukum", "Universitas XYZ");

        // Membuat objek mahasiswa
//        Mahasiswa[] mahasiswaArray = {
//            new Mahasiswa("Siti Fatimah", "Kota1", "NPM1", 80, 85, 90, 95, 88, informatika),
//            new Mahasiswa("Nama2", "Kota2", "NPM2", 70, 75, 80, 85, 78, manajemen),
//            new Mahasiswa("Nama3", "Kota3", "NPM3", 60, 65, 70, 75, 68, hukumBisnis),
//            new Mahasiswa("Nama4", "Kota4", "NPM4", 50, 55, 60, 65, 58, informatika),
//            new Mahasiswa("Nama5", "Kota5", "NPM5", 40, 45, 50, 55, 48, manajemen)
//        };

//        // Menambahkan mahasiswa ke arrayMahasiswa
//        for (Mahasiswa mahasiswa : mahasiswaArray) {
//            inputSatuMahasiswa(mahasiswa);
//        }

        // Membuka layar input
        LayarInput layarInput = new LayarInput();
    }
}
