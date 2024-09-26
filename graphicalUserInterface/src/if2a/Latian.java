package if2a;

import javax.swing.JOptionPane;

public class Latian {

	public static void main(String[] args) {
		String nama = JOptionPane.showInputDialog("Masukkan Nama Anda ");
		String prodi = JOptionPane.showInputDialog("Masukkan Nama Prodi Anda ");
		String tampil = nama + " Selamat datang" + prodi;
		JOptionPane.showMessageDialog(null, tampil);
	}

}
