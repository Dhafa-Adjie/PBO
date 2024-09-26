package view;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import if2a.Tugas3_MDA;
import model.Sepatu;

public class Layar1 extends JFrame implements ActionListener{
    JLabel label = new JLabel(new ImageIcon("A:\\image\\head.png"));
    ImageIcon img[] = new ImageIcon[12];
    JButton[] katalog = new JButton[img.length];
    JButton checkoutButton = new JButton("Keranjang");

    // Strings
    String [] url = new String[img.length];
    String [] merk = {"Hiking Black", "Fresh Pink Casual", "Brave Red Sneakers", "Golden Glow Sneakers", "Grey Elegance Snekaers", "Lime Burst Force 1", "Green Camo Force 1",
    		"Cyan Splash Bros", "Sky Blue Air Gordon", "Royal Blue Pantofel", "Navy Classic Low", "Daring Pink Sneakers"};
    String [] desc = {"Dirancang untuk mendukung petualangan luar ruangan Anda, sepatu hiking hitam ini menawarkan daya tahan dan kenyamanan maksimal. Dibuat dengan material berkualitas tinggi yang tahan air dan permukaan berbatu, sol karet yang kuat memberikan cengkeraman yang optimal di berbagai medan. Lapisan dalam yang empuk dan desain ergonomis memastikan kaki Anda tetap nyaman selama perjalanan panjang. Dengan tampilan hitam yang elegan dan tangguh, sepatu ini cocok untuk pendaki pemula maupun profesional.",
    					"Hadir dengan warna pink segar yang memikat, sepatu casual ini dirancang untuk memberikan kenyamanan dan gaya dalam aktivitas sehari-hari Anda. Terbuat dari bahan berkualitas tinggi yang lembut dan breathable, sepatu ini memastikan kaki Anda tetap sejuk dan nyaman sepanjang hari. Sol yang ringan dan fleksibel memberikan kenyamanan ekstra saat berjalan, sementara desain yang trendi membuatnya cocok dipadukan dengan berbagai outfit kasual Anda. Cocok untuk digunakan dalam berbagai kesempatan, baik untuk berjalan-jalan santai maupun acara kasual lainnya.",
    					"Berani tampil beda dengan sepatu sneakers berwarna merah menyala ini. Brave Red Sneakers dirancang untuk mereka yang ingin mengekspresikan diri dengan gaya dan percaya diri. Terbuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, sepatu ini dilengkapi dengan sol karet yang fleksibel dan empuk, memberikan kenyamanan maksimal untuk penggunaan sehari-hari. Desain yang ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman sepanjang hari. Sepatu ini sangat cocok untuk berbagai aktivitas kasual, dari jalan-jalan santai hingga hangout bersama teman-teman.",
    					"Dengan warna emas yang mewah dan berkilau, Golden Glow Sneakers membawa sentuhan glamor ke dalam gaya sehari-hari Anda. Sepatu ini dirancang untuk mereka yang ingin tampil mencolok dan penuh percaya diri. Terbuat dari bahan premium yang tahan lama dan nyaman, Golden Glow Sneakers memiliki sol karet yang fleksibel dan empuk untuk kenyamanan maksimal sepanjang hari. Desain yang ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman, sementara warna emas yang elegan membuatnya cocok untuk berbagai kesempatan, baik acara kasual maupun semi-formal. Jadikan Golden Glow Sneakers sebagai pilihan utama Anda untuk tampilan yang memukau dan stylish.",
    					"Dengan warna abu-abu yang elegan dan serbaguna, Gray Elegance Sneakers adalah pilihan sempurna untuk gaya yang santai namun tetap chic. Sepatu ini dibuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, memastikan kaki Anda tetap nyaman sepanjang hari. Sol karet yang fleksibel memberikan dukungan optimal dan kenyamanan ekstra saat berjalan. Desain yang ergonomis dan breathable menjaga kaki tetap sejuk, sementara warna abu-abu yang netral membuat sepatu ini mudah dipadukan dengan berbagai outfit. Cocok untuk berbagai kesempatan, dari kegiatan sehari-hari hingga acara kasual yang lebih formal",
    					"Tampilkan gaya yang segar dan energik dengan Lime Burst Force 1. Warna lime yang cerah dan mencolok membuat sepatu ini menjadi pilihan yang berani dan penuh semangat. Terbuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, Lime Burst Sneakers memiliki sol karet yang fleksibel dan empuk, memberikan kenyamanan maksimal sepanjang hari. Desain yang ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman. Sepatu ini sangat cocok untuk berbagai aktivitas kasual, dari berjalan-jalan di kota hingga aktivitas luar ruangan. Jadikan Lime Burst Sneakers sebagai bagian dari koleksi sepatu Anda untuk tampilan yang fresh dan stylish.",
    					"Dengan motif kamuflase hijau yang trendi, Green Camo Sneakers adalah pilihan ideal untuk Anda yang menyukai gaya petualang. Sepatu ini dibuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, memastikan kaki Anda tetap terlindungi dan nyaman sepanjang hari. Sol karet yang fleksibel memberikan cengkeraman yang optimal di berbagai medan, sementara desain yang ergonomis menjaga kaki tetap sejuk dan nyaman. Sepatu ini cocok untuk aktivitas outdoor maupun kasual harian Anda.",
    					"Tambahkan sentuhan warna yang cerah dengan Cyan Splash Sneakers. Warna cyan yang hidup membuat sepatu ini menjadi pusat perhatian di mana pun Anda berada. Dibuat dari bahan berkualitas tinggi yang breathable dan nyaman, Cyan Splash Sneakers memiliki sol karet yang empuk dan fleksibel, memberikan kenyamanan sepanjang hari. Desain ergonomis memastikan kaki Anda tetap sejuk dan nyaman. Sepatu ini sangat cocok untuk berbagai aktivitas kasual, dari jalan-jalan hingga hangout bersama teman-teman.",
    					"Nikmati kenyamanan dan gaya dengan Sky Blue Sneakers. Warna biru langit yang lembut dan menenangkan membuat sepatu ini menjadi pilihan yang sempurna untuk suasana santai. Terbuat dari bahan premium yang breathable dan nyaman, Sky Blue Sneakers memiliki sol karet yang fleksibel dan empuk untuk kenyamanan maksimal sepanjang hari. Desain yang ergonomis memastikan kaki Anda tetap sejuk dan nyaman. Cocok untuk berbagai aktivitas kasual dan perjalanan santai.",
    					"Tampil elegan dan berkelas dengan Royal Blue Pantofel. Warna biru kerajaan yang menawan memberikan sentuhan keanggunan pada gaya sehari-hari Anda. Dibuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, Royal Blue Sneakers memiliki sol karet yang fleksibel dan empuk, memberikan kenyamanan maksimal sepanjang hari. Desain ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman. Sepatu ini cocok untuk berbagai kesempatan, baik kasual maupun semi-formal.",
    					"Dengan warna navy yang klasik dan serbaguna, Navy Classic Sneakers adalah pilihan sempurna untuk gaya yang santai namun tetap stylish. Sepatu ini dibuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, memastikan kaki Anda tetap nyaman sepanjang hari. Sol karet yang fleksibel memberikan dukungan optimal dan kenyamanan ekstra saat berjalan. Desain yang ergonomis dan breathable menjaga kaki tetap sejuk, sementara warna navy yang netral membuat sepatu ini mudah dipadukan dengan berbagai outfit. Cocok untuk berbagai kesempatan, dari kegiatan sehari-hari hingga acara kasual yang lebih formal.",
    					"Tampil berani dan mencolok dengan Daring Pink Sneakers. Warna pink yang cerah dan mencolok membuat sepatu ini menjadi pilihan yang penuh gaya dan percaya diri. Terbuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, Daring Pink Sneakers memiliki sol karet yang fleksibel dan empuk, memberikan kenyamanan maksimal sepanjang hari. Desain yang ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman. Sepatu ini sangat cocok untuk berbagai aktivitas kasual, dari berjalan-jalan di kota hingga aktivitas luar ruangan. Jadikan Daring Pink Sneakers sebagai bagian dari koleksi sepatu Anda untuk tampilan yang memukau dan stylish."
    };
    String [] warna = {"Default", "Merah", "Putih", "Krem"};
    String[] harga = {"Rp.299000", "Rp.250000", "Rp.319000", "Rp.429000", "Rp.499000", "Rp.249000", "Rp.250000",
    					"Rp.679000", "Rp.799000", "Rp.399000", "Rp.250000", "Rp.249000"};

    // Untuk laman detail
    Choice warn = new Choice();
    JLabel [] labelMerk = new JLabel[12];
    JLabel [] lbHarga = new JLabel[12];
    JTextArea [] desk = new JTextArea[12];
    JRadioButton [] ukuran = new JRadioButton[12];
    ButtonGroup uk = new ButtonGroup();
    JTextField nama = new JTextField("Masukkan Nama Pembeli...");
    
    public Layar1() throws HeadlessException {
        super("Toko Sepatu CRT Style");

        setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.add(label);
        add(headerPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 4, 10, 10)); 

        for (int i = 0 ; i<4 ; i++) {
        	warn.add(warna[i]);
        }
        for (int i = 0; i < 12; i++) {
        	// Untuk JFrame detail barang
        	labelMerk[i] = new JLabel(merk[i]);
        	desk[i]= new JTextArea(desc[i]);
        	ukuran[i] = new JRadioButton(String.valueOf(35 + i));
        	uk.add(ukuran[i]);
        	lbHarga[i] = new JLabel(harga[i]);
        	
        	// Untuk laman home
        	url[i] = "A:\\mdp\\PBO\\tugas3_mda\\src\\image\\sn"+i+".png";
        	img[i] = new ImageIcon(url[i]);
        	
        	// Laman home
            katalog[i] = new JButton(img[i]);
            katalog[i].addActionListener(this);
            katalog[i].setBackground(Color.white);
            buttonPanel.add(katalog[i]);
        }

        JScrollPane scrollPane = new JScrollPane(buttonPanel);
        add(scrollPane, BorderLayout.CENTER);

        JPanel footerPanel = new JPanel();
        footerPanel.add(checkoutButton);
        add(footerPanel, BorderLayout.SOUTH);

        checkoutButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TampilanTabel tabel = new TampilanTabel();
			}
		});
        setSize(1000, 300);
        setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		for(int i = 0 ; i < katalog.length ; i++) {
			if (object == katalog[i]) {
				JFrame frame2 = new JFrame();
				frame2.setSize(750, 500);
				frame2.setLayout(new BorderLayout());

		        // Panel for the icon
		        JPanel iconPanel = new JPanel();
		        iconPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		        ImageIcon originalIcon = img[i];
		        Image originalImage = originalIcon.getImage();
		        Image resizedImage = originalImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		        ImageIcon resizedIcon = new ImageIcon(resizedImage);
		        JLabel iconLabel = new JLabel(resizedIcon);
		        iconPanel.add(iconLabel);
		        
		        // Panel for details
		        JPanel detailsPanel = new JPanel();
		        detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.Y_AXIS));
		        
		        detailsPanel.add(labelMerk[i]);
		        String m = labelMerk[i].getText();
		        
		        desk[i].setLineWrap(true);
		        desk[i].setWrapStyleWord(true);
		        desk[i].setEditable(false);
		        JScrollPane descScrollPane = new JScrollPane(desk[i]);
		        descScrollPane.setPreferredSize(new Dimension(250, 100));
		        
		        detailsPanel.add(descScrollPane);
		        detailsPanel.add(lbHarga[i]);
		        int h = Integer.parseInt((lbHarga[i].getText()).substring(3));
		        detailsPanel.add(warn);
		        String w = warn.getSelectedItem();
		        
		        JPanel radioPanel = new JPanel();
		        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		        for (int j = 0; j < 12; j++) {
		            radioPanel.add(ukuran[j]);
		        }
		        detailsPanel.add(radioPanel);
		        
		        JPanel customerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		        JLabel customerLabel = new JLabel("Nama Customer:");
		        JTextField customerTextField = new JTextField(20); // Adjust the size as needed
		        customerPanel.add(customerLabel);
		        customerPanel.add(customerTextField);
		        detailsPanel.add(customerPanel);
		        

		        JPanel buttonPanel = new JPanel();
		        buttonPanel.setLayout(new GridLayout(1, 2, 10, 0));
		        JButton tambah = new JButton("Tambah");
		        buttonPanel.add(tambah);
		        tambah.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						for (int i = 0 ; i < 12 ; i++) {
							 if (ukuran[i].isSelected()) {
								 JOptionPane.showMessageDialog(null, "Barang Berhasil ditambahkan ke dalam keranjang ╰(*°▽°*)╯");
								int u = Integer.parseInt((ukuran[i].getText()));
								Tugas3_MDA.inputSpt(new Sepatu(m, warn.getSelectedItem(), u, h, customerTextField.getText()));
							 }
						}		
					}
				});
		        
		        frame2.add(iconPanel, BorderLayout.WEST);
		        frame2.add(detailsPanel, BorderLayout.CENTER);
		        frame2.add(buttonPanel, BorderLayout.SOUTH);
		        frame2.setVisible(true);
		        
			}
		}
	}
}
