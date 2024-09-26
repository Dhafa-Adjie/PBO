package if2a;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Item {
	private String nama, keterangan;
	private int harga ;
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public Item(String nama, String keterangan, int harga) {
		super();
		this.nama = nama;
		this.keterangan = keterangan;
		this.harga = harga;
	}
	
}

public class CobaKoin {

	 public static void main(String[] args) {
		 int koin = 21;
		 int i = 0 ;
		 int jawaban ;
		 
		 JFrame frame1 = new JFrame("MDhafaAdjie");
		 JButton yes = new JButton("Lanjut");
		 JButton no = new JButton("Tidak");
		 JLabel titel1 = new JLabel("Pilih item yang akan anda beli =");
		 
		 Item [] item = new Item[3];
		 item[0] = new Item("Buah Zakar", "Buah langka yang hanya ditemukan di sisi selatan pesisir Jawa", 7);
		 item[1] = new Item("Ular Mythic Panji Petualang", "Ular langka yang konon katanya bisa memuntahkan cairan putih", 5);
		 item[2] = new Item("Shotgan Api Cetek-Cetek", "Shotgan api legendaris yang hanya bisa ditemukan di Peak", 8);
		 
		 Choice pilih = new Choice();
		 pilih.add(item[0].getNama());
		 pilih.add(item[1].getNama());
		 pilih.add(item[2].getNama());
		 
		 frame1.add(titel1);
		 frame1.add(pilih);
		 frame1.setVisible(true);
		 frame1.setSize(500, 500);
		 frame1.add(yes);
		 frame1.add(no);
		 
		 frame1.setLayout(new FlowLayout(4,1,1));


//		 do {
//			 
//			 jawaban = JOptionPane.showConfirmDialog(null, "Yakin", "Apalah", JOptionPane.YES_NO_OPTION);
//			 i++;
//		} while (i < item.length);
		 
	 }
}
