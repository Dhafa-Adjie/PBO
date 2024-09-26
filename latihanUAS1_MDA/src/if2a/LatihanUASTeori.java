package if2a;

//class UnderWaterSuperHero {
//}
//
//class FlyingSuperHero{						// Berhasil
//}
//
//class Superman extends UnderWaterSuperHero{
//}

//class Xmen extends UnderWaterSuperHero, FlyingSuperHero{
//	
//} Anda hanya bisa mewarisi satu kelas (class) pada satu waktu. Java tidak mendukung multiple inheritance (pewarisan ganda) untuk kelas.

//interface UnderWaterSuper extends Xmen {
//}  Interface tidak bisa extends class

//interface FlyingSuperHero implements UnderWaterSuperHero{
//	void dive();
//} Interface tidak bisa implements Interface

//interface FlyingSuperHero{
//	void dive();
//}
//interface UnderWaterSuperHero {
//	void fly();
//}
//class Xmen implements FlyingSuperHero, UnderWaterSuperHero{
//
//	@Override
//	public void fly() {
//		System.out.println("Terbang CIK!");
//	}
//
//	@Override
//	public void dive() {
//		System.out.println("Suka Diving ?");
//	}
//}

//class Man implements FlyingSuperHero, UnderWaterSuperHero{} // harus implements method

//class Xmen extends FlyingSuperHero{  // tidak bisa karena yang bisa di extends cuma kelas, sedangkan Interface menggunakan implements
//}										// 

//class Xmen implements UnderWaterSuperHero, FlyingSuperHero{   // kelas bisa Implements multiple Interface
//}

//class A{}
//class B{}
//class C{}
//
//interface X{}
//interface Y{}
//interface Z{}

/*Extends Suatu Interface*/
//class Praktikum extends X{} // class Tidak bisa extends interface
//interface PraktikumLab601 extends X{} // Interface bisa extends Interface
//interface Praktikum605 extends X,Y{} // Bisa multiple
//
///*Implements suatu Interface*/
//class PBO implements X{}
//class BasisData implements X,Y,Z{} // Class bisa Implements Multiple Interface
//interface ASD implements X{} // Interface tidak bisa implements Interface, hanya bisa extends
//
///*Extends suatu class*/
//class Kalkulus extends A{}
//class PW extends A,B,C{} // Class tidak bisa extends multiple class
//interface Lantai5 extends A{} // Interface tidak bisa extends Class
//
///*Implements suatu class*/
//class Apa implements A{} // Class tidak bisa implement class
//interface JOKI implements A{} // Hanya interface yang bisa di implements

public class LatihanUASTeori {

	public static void main(String[] args) {
		int[] nilaiMahasiswa = new int[40]; // jumlah elemen = 40, dimulai dari index ke-0 sampai 39
        try {
//            nilaiMahasiswa[40] = 85; // Salah Index Array
        // 	  nilaiMahasiswa[2] = 8000/0  // Salah perhitungan
//        	nilaiMahasiswa[2] = Integer.parseInt("Baik"); //Salah pada format angka
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan pada format angka");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan pada index array");
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan pada perhitungan");
        } catch (Exception e) {
        	System.out.println("Exception lainnya!");
        }
        finally {
            System.out.println("Good luck");
        }
	}

}
