package if2a;

public class Belajardebug_kucing {
	public static void main(String[] args) {
 		Kucing kucingPertama = new Kucing("oren");
 		kucingPertama.setUmur(1);
 		
 		Kucing kucingKedua = new Kucing("putih");
 		kucingKedua.setUmur(0);
 		
 		Kucing[] kucing = new Kucing[3];
 		kucing[0] = kucingPertama;
 		kucing[1] = kucingKedua;
 		kucing[2] = new Kucing("Ambatron");
 		kucing[2].setUmur(31);
 		
 		for(int i = 0; i<3; i++) {
 			System.out.println("umur dari kucing bernama " + kucing[i].getNamaKucing() + " adalah " + kucing[i].getUmur()); 		
 			}
 		System.out.println();
	}
}
class Kucing{
	private String namaKucing;
	private int umur;
	
	public Kucing(String namaKucing) {
		this.namaKucing = namaKucing;
	}
	public String getNamaKucing() {
		return namaKucing;
	}
	public void setNamaKucing(String namaKucing) {
		this.namaKucing = namaKucing;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
}
