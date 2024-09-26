package if2a;

import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


class Tipe {
	private String nama, ket;
	private int harga;
	public Tipe(String nama, String ket, int harga) {
		super();
		this.nama = nama;
		this.ket = ket;
		this.harga = harga;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKet() {
		return ket;
	}
	public void setKet(String ket) {
		this.ket = ket;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
}

public class BonusPoint_Input {
	private static int jumlah, total;
	private static String nmpkt, ketpkt;
	
	public static void shuffleArray(String[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

	public static void main(String[] args) {
		JLabel label = new JLabel("Pilih paket yang di inginkan : ");
		Choice pilihPaket = new Choice();
		JButton back = new JButton("Kembali");
		JButton ket = new JButton("Lihat Detail");
		JButton lanjut = new JButton("Lanjut");
		
		Tipe [] item = new Tipe[4];
		item [0] = new Tipe("Paket kombo 14 GB", "Paket kuota internet 14 GB 24 jam berlaku 30 hari", 25000);
		item [1] = new Tipe("Paket unlimited 30 hari", "Paket kuota internet unlimited pukul 00.00 - 18.00 berlaku 30 hari", 60000);
		item [2] = new Tipe("Paket gaming sepuasnya 15 GB", "Paket kuota internet 15 GB 24 jam berlaku 30 hari dan dapatkan kesempatan mendapatkan diamond gratis", 30000);
		item [3] = new Tipe("Paket roaming 5 GB", "Paket roaming, membuat perjalanan travelling anda lebih menyenangkan", 27000);
		pilihPaket.add(item [0].getNama());
		pilihPaket.add(item [1].getNama());
		pilihPaket.add(item [2].getNama());
		pilihPaket.add(item [3].getNama());
		String email = JOptionPane.showInputDialog("Masukkan email anda ");
		String nama = JOptionPane.showInputDialog("Masukkan nama");
		String numb [] = {"0","1","2","4","3","5","6","7","8","9"};
		String kode;
		shuffleArray(numb);
		
		int i=0;
		kode = numb[i].concat(numb[++i]).concat(numb[++i]).concat(numb[++i]);
		
		JOptionPane.showMessageDialog(null, "Kami akan mengirimkan kode OTP", "Konfirmasi", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, kode , "Kode OTP", JOptionPane.INFORMATION_MESSAGE);
		
		String inputKode = JOptionPane.showInputDialog("Masukkan kode OTP");
		
		if (inputKode.equals(kode)) {
			JFrame frame = new JFrame("Laman Pembelian Paket");
			frame.add(label);
			frame.add(pilihPaket);
			frame.add(back);
			frame.add(ket);
			frame.add(lanjut);
			frame.setLocation(0, 0);
			frame.setVisible(true);
			frame.setSize(400, 300);
			frame.setLayout(new GridLayout(3, 2));
			back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose(); // Close the current frame
                    main(args); // Re-run the main method to show OTP input dialog again
                }
            });

			ActionListener tomlnjt = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String selectedPaket = pilihPaket.getSelectedItem();
                    for (Tipe t : item) {
                        if (t.getNama().equals(selectedPaket)) {
                            String message = "Keterangan: " + t.getKet() + "\nHarga: Rp " + t.getHarga();
                            JOptionPane.showMessageDialog(null, message, "Detail Paket", JOptionPane.YES_NO_CANCEL_OPTION);
                        }
                    }
				}
			};
			
			ActionListener ljt = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					LocalDateTime timestamp = LocalDateTime.now();
					try {
						jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah beli : "));
					} catch (Exception e2) {
						jumlah = 0;
					}
					String selectedPaket = pilihPaket.getSelectedItem();
					
                    for (Tipe t : item) {
                        if (t.getNama().equals(selectedPaket)) {
                            total = jumlah * t.getHarga();
                            nmpkt = t.getNama();
                            ketpkt = t.getKet();
                        }
                    }
                    String head = "Selamat paket internet sudah berhasil dibeli";
                    String forlabel = "Nama penggguna : " + nama +"\n";
                    String pktplh = "Paket yang dipilih : " + nmpkt;
                    String labes3 = "Jumlah paket yang dibeli : " + jumlah;
                    String labes4 = "Total bayar sebesar Rp." + total + " telah dipotong dari saldo pulsa anda";
                    String waktu = ""+ timestamp;
					JFrame frm = new JFrame("Konfirmasi pembelian");
					
					JLabel [] label = new JLabel[6];
					label[0] = new JLabel(head);
					label[1] = new JLabel(forlabel);
					label[2] = new JLabel(pktplh);
					label[3] = new JLabel(labes3);
					label[4] = new JLabel(labes4);
					label[5] = new JLabel(waktu);
					
					frm.setLocation(0, 0);
					frm.setVisible(true);
					frm.setSize(400, 300);
					frm.setLayout(new GridLayout(6, 6));
					
					for(int i = 0 ; i<6;i++) {
						frm.add(label[i]);
					}
				}
			};
			
			lanjut.addActionListener(ljt);
			ket.addActionListener(tomlnjt);
		} else {
			JOptionPane.showMessageDialog(null, "Kode OTP salah", "Error Input", JOptionPane.ERROR_MESSAGE);
		}
	}

}
