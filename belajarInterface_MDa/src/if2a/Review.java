package if2a;

abstract class Hewan{	// Abstrct Class
	public abstract void bersuara();
	public abstract void makan();
}

class Tikus extends Hewan{	// Concrete Class

	@Override
	public void bersuara() {
		System.out.println("Berdecit");
	}

	@Override
	public void makan() {
		System.out.println("Tikus makan keju");
	}  
	
}

public class Review {

	public static void main(String[] args) {
		System.out.println("=== Review Abs ===");
//		Hewan justin = new Hewan(); // Tidak bisa , karena kelas abstrak harus diturunkan ke kelas concrete terlebih dahulu
		Tikus towel = new Tikus();
		towel.bersuara();
		towel.makan();
	}

}
