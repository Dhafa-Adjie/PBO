package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import if2a.Tugas3_MDA;
import model.Sepatu;

public class TampilanTabel extends JFrame {
	String [] headTable = {"No", "Nama", "Merk", "Warna", "Ukuran", "Harga"};
    private void bentukLayar() {
        this.setTitle("Keranjang");//super(":: NPM - NAMA ::");
        this.setSize(1000, 400);
        this.setLocation(0, 0);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
    
    public TampilanTabel() throws HeadlessException {
		super();
		bentukLayar();
		
		ArrayList<Sepatu> dataSepatu = Tugas3_MDA.getData();
		Object [][] isiT = new Object[dataSepatu.size()][7];
		int i = 0;
		double total = 0 ;
		for (Sepatu spt : dataSepatu) {
			isiT[i][0] = (i+1);
			isiT[i][1] = spt.getNama();
			isiT[i][2] = spt.getMerk();
			isiT[i][3] = spt.getWarna();
			isiT[i][4] = spt.getUkuran();
			isiT[i][5] = spt.getHarga();
			total += spt.getHarga();
			i++;
		}
		setLayout(new GridLayout(2, 1));
		JLabel labTotal = new JLabel("Total Pembayaran Rp." + total);
		JButton checkOut = new JButton("Checkout");
		checkOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int ch = JOptionPane.showConfirmDialog(null, "Checkout barang?");
				if (ch == 0) {
					JFrame layar2 = new JFrame("Laman Checkout");
					layar2.setSize(1000, 400);
					layar2.setResizable(false);
					layar2.setVisible(true);
				}
			}
		});
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JTable tabelData = new JTable(isiT, headTable);
		JScrollPane scrollPane = new JScrollPane(tabelData);
		add(scrollPane);
		panel.add(labTotal); panel.add(checkOut);
		add(panel);
		tabelData.setEnabled(false);
		setVisible(true);
    }
}
