package if2a;

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

class Sepatu {
	private String merk;
	private String deskripsi;
	private String warna;
	private String url;
	private int ukuran;
	private double harga;
	private String nama;
	public Sepatu() {
		super();
	}
	public Sepatu(String merk, String deskripsi, String warna, String url, int ukuran, double harga, String nama) {
		super();
		this.merk = merk;
		this.deskripsi = deskripsi;
		this.warna = warna;
		this.url = url;
		this.ukuran = ukuran;
		this.harga = harga;
		this.nama = nama;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getDeskripsi() {
		return deskripsi;
	}
	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getUkuran() {
		return ukuran;
	}
	public void setUkuran(int ukuran) {
		this.ukuran = ukuran;
	}
	public double getHarga() {
		return harga;
	}
	public void setHarga(double harga) {
		this.harga = harga;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
}

class Layar1 extends JFrame implements ActionListener{
    JLabel label = new JLabel(new ImageIcon("A:\\image\\head.png"));
//    ImageIcon img[] = {
//        new ImageIcon("A:\\image\\sn0.png"), new ImageIcon("A:\\image\\sn1.png"),
//        new ImageIcon("A:\\image\\sn2.png"), new ImageIcon("A:\\image\\sn3.png"),
//        new ImageIcon("A:\\image\\sn4.png"), new ImageIcon("A:\\image\\sn5.png"),
//        new ImageIcon("A:\\image\\sn6.png"), new ImageIcon("A:\\image\\sn7.png"),
//        new ImageIcon("A:\\image\\sn8.png"), new ImageIcon("A:\\image\\sn9.png"),
//        new ImageIcon("A:\\image\\sn10.png"), new ImageIcon("A:\\image\\sn11.png")
//    };
    Sepatu sepatu [] = new Sepatu[12];
    ImageIcon img [] = new ImageIcon[12];
    JButton[] katalog = new JButton[img.length];
    String [] url = new String[img.length];
    JButton checkoutButton = new JButton("Checkout > > >");

    public Layar1() throws HeadlessException {
        super("Toko Sepatu CRT");
        
        setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.add(label);
        add(headerPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 4, 10, 10)); 

        for (int i = 0; i < 12; i++) {
        	url[i] = "A:\\mdp\\PBO\\tugas3_mda\\src\\image\\sn"+i+".png";
        	sepatu[i] = new Sepatu();
        	sepatu[i].setUrl(url[i]);
        	img[i] = new ImageIcon(sepatu[i].getUrl());
            katalog[i] = new JButton(img[i]);
            katalog[i].addActionListener(this);
            katalog[i].setBackground(Color.white);
            buttonPanel.add(katalog[i]);
        }
        sepatu[0] = new Sepatu("Hiking Black", "Dirancang untuk mendukung petualangan luar ruangan Anda, sepatu hiking hitam ini menawarkan daya tahan dan kenyamanan maksimal. Dibuat dengan material berkualitas tinggi yang tahan air dan permukaan berbatu, sol karet yang kuat memberikan cengkeraman yang optimal di berbagai medan. Lapisan dalam yang empuk dan desain ergonomis memastikan kaki Anda tetap nyaman selama perjalanan panjang. Dengan tampilan hitam yang elegan dan tangguh, sepatu ini cocok untuk pendaki pemula maupun profesional."
        						, null, sepatu[0].getUrl(), 0, 299000, null);
        sepatu[1] = new Sepatu("Fresh Pink Casual", "Hadir dengan warna pink segar yang memikat, sepatu casual ini dirancang untuk memberikan kenyamanan dan gaya dalam aktivitas sehari-hari Anda. Terbuat dari bahan berkualitas tinggi yang lembut dan breathable, sepatu ini memastikan kaki Anda tetap sejuk dan nyaman sepanjang hari. Sol yang ringan dan fleksibel memberikan kenyamanan ekstra saat berjalan, sementara desain yang trendi membuatnya cocok dipadukan dengan berbagai outfit kasual Anda. Cocok untuk digunakan dalam berbagai kesempatan, baik untuk berjalan-jalan santai maupun acara kasual lainnya."
        						, null, sepatu[1].getUrl(), 0, 250000, null);
        sepatu[2] = new Sepatu("Brave Red Sneakers", "Berani tampil beda dengan sepatu sneakers berwarna merah menyala ini. Brave Red Sneakers dirancang untuk mereka yang ingin mengekspresikan diri dengan gaya dan percaya diri. Terbuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, sepatu ini dilengkapi dengan sol karet yang fleksibel dan empuk, memberikan kenyamanan maksimal untuk penggunaan sehari-hari. Desain yang ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman sepanjang hari. Sepatu ini sangat cocok untuk berbagai aktivitas kasual, dari jalan-jalan santai hingga hangout bersama teman-teman."
								, null, sepatu[2].getUrl(), 0, 319000, null);
        sepatu[3] = new Sepatu("Golden Glow Sneakers", "Dengan warna emas yang mewah dan berkilau, Golden Glow Sneakers membawa sentuhan glamor ke dalam gaya sehari-hari Anda. Sepatu ini dirancang untuk mereka yang ingin tampil mencolok dan penuh percaya diri. Terbuat dari bahan premium yang tahan lama dan nyaman, Golden Glow Sneakers memiliki sol karet yang fleksibel dan empuk untuk kenyamanan maksimal sepanjang hari. Desain yang ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman, sementara warna emas yang elegan membuatnya cocok untuk berbagai kesempatan, baik acara kasual maupun semi-formal. Jadikan Golden Glow Sneakers sebagai pilihan utama Anda untuk tampilan yang memukau dan stylish."
								, null, sepatu[3].getUrl(), 0, 429000, null);
        sepatu[4] = new Sepatu("Grey Elegance Snekaers", "Dengan warna abu-abu yang elegan dan serbaguna, Gray Elegance Sneakers adalah pilihan sempurna untuk gaya yang santai namun tetap chic. Sepatu ini dibuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, memastikan kaki Anda tetap nyaman sepanjang hari. Sol karet yang fleksibel memberikan dukungan optimal dan kenyamanan ekstra saat berjalan. Desain yang ergonomis dan breathable menjaga kaki tetap sejuk, sementara warna abu-abu yang netral membuat sepatu ini mudah dipadukan dengan berbagai outfit. Cocok untuk berbagai kesempatan, dari kegiatan sehari-hari hingga acara kasual yang lebih formal"
								, null, sepatu[4].getUrl(), 0, 499000, null);
        sepatu[5] = new Sepatu("Lime Burst Force 1", "Tampilkan gaya yang segar dan energik dengan Lime Burst Force 1. Warna lime yang cerah dan mencolok membuat sepatu ini menjadi pilihan yang berani dan penuh semangat. Terbuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, Lime Burst Sneakers memiliki sol karet yang fleksibel dan empuk, memberikan kenyamanan maksimal sepanjang hari. Desain yang ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman. Sepatu ini sangat cocok untuk berbagai aktivitas kasual, dari berjalan-jalan di kota hingga aktivitas luar ruangan. Jadikan Lime Burst Sneakers sebagai bagian dari koleksi sepatu Anda untuk tampilan yang fresh dan stylish."
								, null, sepatu[5].getUrl(), 0, 249000, null);
        sepatu[6] = new Sepatu("Green Camo Force 1", "Dengan motif kamuflase hijau yang trendi, Green Camo Sneakers adalah pilihan ideal untuk Anda yang menyukai gaya petualang. Sepatu ini dibuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, memastikan kaki Anda tetap terlindungi dan nyaman sepanjang hari. Sol karet yang fleksibel memberikan cengkeraman yang optimal di berbagai medan, sementara desain yang ergonomis menjaga kaki tetap sejuk dan nyaman. Sepatu ini cocok untuk aktivitas outdoor maupun kasual harian Anda."
								, null, sepatu[6].getUrl(), 0, 250000, null);
        sepatu[7] = new Sepatu("Cyan Splash Bros", "Tambahkan sentuhan warna yang cerah dengan Cyan Splash Sneakers. Warna cyan yang hidup membuat sepatu ini menjadi pusat perhatian di mana pun Anda berada. Dibuat dari bahan berkualitas tinggi yang breathable dan nyaman, Cyan Splash Sneakers memiliki sol karet yang empuk dan fleksibel, memberikan kenyamanan sepanjang hari. Desain ergonomis memastikan kaki Anda tetap sejuk dan nyaman. Sepatu ini sangat cocok untuk berbagai aktivitas kasual, dari jalan-jalan hingga hangout bersama teman-teman."
								, null, sepatu[7].getUrl(), 0, 679000, null);
        sepatu[8] = new Sepatu("Sky Blue Air Gordon", "Nikmati kenyamanan dan gaya dengan Sky Blue Sneakers. Warna biru langit yang lembut dan menenangkan membuat sepatu ini menjadi pilihan yang sempurna untuk suasana santai. Terbuat dari bahan premium yang breathable dan nyaman, Sky Blue Sneakers memiliki sol karet yang fleksibel dan empuk untuk kenyamanan maksimal sepanjang hari. Desain yang ergonomis memastikan kaki Anda tetap sejuk dan nyaman. Cocok untuk berbagai aktivitas kasual dan perjalanan santai."
								, null, sepatu[8].getUrl(), 0, 799000, null);
        sepatu[9] = new Sepatu("Royal Blue Pantofel", "Tampil elegan dan berkelas dengan Royal Blue Pantofel. Warna biru kerajaan yang menawan memberikan sentuhan keanggunan pada gaya sehari-hari Anda. Dibuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, Royal Blue Sneakers memiliki sol karet yang fleksibel dan empuk, memberikan kenyamanan maksimal sepanjang hari. Desain ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman. Sepatu ini cocok untuk berbagai kesempatan, baik kasual maupun semi-formal."
								, null, sepatu[9].getUrl(), 0, 399000, null);
        sepatu[10] = new Sepatu("Navy Classic Low", "Dengan warna navy yang klasik dan serbaguna, Navy Classic Sneakers adalah pilihan sempurna untuk gaya yang santai namun tetap stylish. Sepatu ini dibuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, memastikan kaki Anda tetap nyaman sepanjang hari. Sol karet yang fleksibel memberikan dukungan optimal dan kenyamanan ekstra saat berjalan. Desain yang ergonomis dan breathable menjaga kaki tetap sejuk, sementara warna navy yang netral membuat sepatu ini mudah dipadukan dengan berbagai outfit. Cocok untuk berbagai kesempatan, dari kegiatan sehari-hari hingga acara kasual yang lebih formal."
								, null, sepatu[10].getUrl(), 0, 250000, null);
        sepatu[11] = new Sepatu("Daring Pink Sneakers", "Tampil berani dan mencolok dengan Daring Pink Sneakers. Warna pink yang cerah dan mencolok membuat sepatu ini menjadi pilihan yang penuh gaya dan percaya diri. Terbuat dari bahan berkualitas tinggi yang tahan lama dan nyaman, Daring Pink Sneakers memiliki sol karet yang fleksibel dan empuk, memberikan kenyamanan maksimal sepanjang hari. Desain yang ergonomis dan breathable memastikan kaki Anda tetap sejuk dan nyaman. Sepatu ini sangat cocok untuk berbagai aktivitas kasual, dari berjalan-jalan di kota hingga aktivitas luar ruangan. Jadikan Daring Pink Sneakers sebagai bagian dari koleksi sepatu Anda untuk tampilan yang memukau dan stylish."
								, null, sepatu[11].getUrl(), 0, 249000, null);
        JScrollPane scrollPane = new JScrollPane(buttonPanel);
        add(scrollPane, BorderLayout.CENTER);

        JPanel footerPanel = new JPanel();
        footerPanel.add(checkoutButton);
        add(footerPanel, BorderLayout.SOUTH);

        checkoutButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
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

		        // Panel for the details
		        JPanel detailsPanel = new JPanel();
		        detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.Y_AXIS));

		        JLabel judul = new JLabel(sepatu[i].getMerk(), SwingConstants.CENTER);

		        JTextArea desc = new JTextArea(sepatu[i].getDeskripsi());
		        desc.setLineWrap(true);
		        desc.setWrapStyleWord(true);
		        desc.setEditable(false);
		        JScrollPane descScrollPane = new JScrollPane(desc);
		        descScrollPane.setPreferredSize(new Dimension(250, 100)); // Adjust size as needed

		        
		        Choice warna = new Choice();
		        warna.add("Hitam");
		        warna.add("Merah");
		        warna.add("Pink");
		        warna.add("Navy");

		        detailsPanel.add(judul);
		        detailsPanel.add(descScrollPane);
		        detailsPanel.add(warna);

		        // Panel for radio buttons
		        JPanel radioPanel = new JPanel();
		        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		        JRadioButton[] uk = new JRadioButton[10];
		        ButtonGroup group = new ButtonGroup();
		        for (int j = 0; j < 10; j++) {
		            uk[j] = new JRadioButton(String.valueOf(35 + j));
		            group.add(uk[j]);
		            radioPanel.add(uk[j]);
		        }
		        detailsPanel.add(radioPanel);

		        // Add JTextField for customer name
		        JPanel customerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		        JLabel customerLabel = new JLabel("Nama Customer:");
		        JTextField customerTextField = new JTextField(20); // Adjust the size as needed
		        customerPanel.add(customerLabel);
		        customerPanel.add(customerTextField);

		        detailsPanel.add(customerPanel);

		        // Panel for buttons
		        JPanel buttonPanel = new JPanel();
		        buttonPanel.setLayout(new GridLayout(1, 2, 10, 0));
		        JButton kembali = new JButton("Kembali");
		        JButton tambah = new JButton("Tambah");
		        buttonPanel.add(tambah);
		        
		        kembali.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(DISPOSE_ON_CLOSE);
					}
				});

		        // Adding panels to the frame
		        frame2.add(iconPanel, BorderLayout.WEST);
		        frame2.add(detailsPanel, BorderLayout.CENTER);
		        frame2.add(buttonPanel, BorderLayout.SOUTH);
		        frame2.setVisible(true);
			}
		}
	}
}

public class Tugas3_MDhafaAdjie {

	public static void main(String[] args) {
		 Layar1 layar = new Layar1();
	}
}
