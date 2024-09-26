package if2a;

import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class LayarBiayaKuliah extends JFrame implements ActionListener{
	private JLabel labelNama = new JLabel("Nama Mahasiswa");
	private JLabel labelFakultas = new JLabel("Fakultas");
	private JLabel labelProgramStudi = new JLabel("Program Studi");
	private JLabel labelAng = new JLabel("Angkatan");
	private Choice angkatan = new Choice();

	private JTextField nama = new JTextField("M. Dhafa Adjie Saputra");
	private Choice choiceFkl = new Choice();
	private JLabel labelKeterangan = new JLabel();
	
	private JLabel labelPRodi = new JLabel("Program Studi");
	private Choice choiceProgramStudi = new Choice(); 
	
	private JLabel labelSKS = new JLabel("Jumlah SKS");
	private Choice choiceSKS = new Choice();
	
	private JLabel labelWaktu = new JLabel("Waktu");
	private Choice choiceWaktu = new Choice();

	private JButton hitung = new JButton("👊  h i t u n g  👊");
	private JButton reset = new JButton("😒 r e s e t  😒 ");

	
	public LayarBiayaKuliah() {
		super("♪ M . Dhafa Adjie Saputra 2327250081 👌");
		choiceFkl.add("FIKR");
		choiceFkl.add("FEB");
		for(int i = 1 ; i <= 9; i++) {
			choiceSKS.add(String.valueOf(i));
		}
		
		for (int i = 2018 ; i<=2023 ; i++) {
			angkatan.add(String.valueOf(i));
		}
		
		choiceWaktu.add("Malam");
		choiceWaktu.add("Siang");
		
		choiceProgramStudi.add("IF");
		choiceProgramStudi.add("SI");
		choiceProgramStudi.add("MI");
		choiceProgramStudi.add("AK");
		choiceProgramStudi.add("MJ");
		choiceProgramStudi.add("TE");



		setSize(400,300);
		setVisible(true);
		setLayout(new GridLayout(8, 2));
		add(labelNama);add(nama); 
		add(labelFakultas);add(choiceFkl);
		add(labelSKS);add(choiceSKS);
		add(labelPRodi);add(choiceProgramStudi);

		add(labelAng);add(angkatan);
		add(labelWaktu);add(choiceWaktu);
		add(hitung);add(reset);
		
		hitung.addActionListener(this);
		reset.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if (object == reset) {
			choiceFkl.select(0);
			nama.setText(null);
			choiceSKS.select(0);
		} else {
			String ket = "Nama Mahsiswa " + nama.getText() + " " + getNamaFakultas(choiceFkl.getSelectedItem()) ;
			labelKeterangan.setText(ket);
		}
	}
	
	public String getNamaFakultas (String kodeFakultas) {
		if (kodeFakultas.equals("FIKR")) {
			return "Fakultas Ilmu Komputer dan Rekayasa";
		} else {
			return "Fakultas Ekonomi dan Bisnis";
		}
	}
	
	public String getNamaProdi (String kodeProdi) {
		if (kodeProdi.equals("IF")) {
			return "Informatika";
		} else if (kodeProdi.equals("SI")) {
			return "Sistem Informasi";
		} else if (kodeProdi.equals("MI")) {
			return "Manajemen Informatika";
		} else if (kodeProdi.equals("TE")) {
			return "Teknik Elektro";
		} else if (kodeProdi.equals("AK")) {
			return "Akuntansi";
		} else {
			return "Manajemen";
		}
	}
	
	public int getNilaiUK1 (int jumlahSKS) {
        if (jumlahSKS <= 4) {
            return 750000; 
        }else if (jumlahSKS < 9 && jumlahSKS > 4) {
            return 950000;
        }else {
            return 0;
        }  
    }
	
	 public int hitungBiayaPerSKS(String fakultas, String prodi, int angkatan, String waktu) {
	        int biaya = 0;

	        if (fakultas.equalsIgnoreCase("FIKR")) {
	            if (prodi.equalsIgnoreCase("IF") || prodi.equalsIgnoreCase("SI")) {
	                switch (angkatan) {
	                    case 2018:
	                        biaya = waktu.equalsIgnoreCase("Pagi") ? 165000 : 190000;
	                        break;
	                    case 2019:
	                    case 2020:
	                    case 2021:
	                    case 2022:
	                    case 2023:
	                        biaya = waktu.equalsIgnoreCase("Pagi") ? 175000 : 200000;
	                        break;
	                }
	            } else if (prodi.equalsIgnoreCase("MI")) {
	                switch (angkatan) {
	                    case 2018:
	                    case 2019:
	                        biaya = waktu.equalsIgnoreCase("Pagi") ? 150000 : 165000;
	                        break;
	                    case 2020:
	                    case 2021:
	                    case 2022:
	                        biaya = 150000;
	                        break;
	                }
	            } else if (prodi.equalsIgnoreCase("TE")) {
	                switch (angkatan) {
	                    case 2021:
	                    case 2022:
	                        biaya = waktu.equalsIgnoreCase("Pagi") ? 90000 : 100000;
	                        break;
	                    case 2023:
	                        biaya = waktu.equalsIgnoreCase("Pagi") ? 100000 : 125000;
	                        break;
	                }
	            }
	        } else if (fakultas.equalsIgnoreCase("FEB")) {
	            switch (angkatan) {
	                case 2018:
	                    biaya = waktu.equalsIgnoreCase("Pagi") ? 140000 : 150000;
	                    break;
	                case 2019:
	                case 2020:
	                case 2021:
	                case 2022:
	                    biaya = waktu.equalsIgnoreCase("Pagi") ? 150000 : 165000;
	                    break;
	                case 2023:
	                    if (prodi.equalsIgnoreCase("AK")) {
	                        biaya = waktu.equalsIgnoreCase("Pagi") ? 150000 : 175000;
	                    } else if (prodi.equalsIgnoreCase("MJ")) {
	                        biaya = waktu.equalsIgnoreCase("Pagi") ? 175000 : 200000;
	                    }
	                    break;
	            }
	        }

	        return biaya;
	    }
	 
	 public int hitungUK2(int biayaPerSKS, int sks) {
	        return biayaPerSKS * sks;
	    }

	    public int hitungBiayaSemesterAntara(int uk1, int uk2) {
	        return uk1 + uk2;
	    }
	
}
