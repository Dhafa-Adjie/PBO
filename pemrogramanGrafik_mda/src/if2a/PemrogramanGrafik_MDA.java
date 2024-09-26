package if2a;
import javax.swing.JFrame;
import javax.swing.JRootPane;

public class PemrogramanGrafik_MDA {

	public static void main(String[] args) {
		JFrame layar = new JFrame();
		layar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layar.setSize(200,200); // ( Width , Height)

		
		layar.setLocation(0, 0);	// (x , y)
		layar.setResizable(false);
		layar.setTitle("::ANJING::");
		layar.setUndecorated(true);
		layar.getRootPane().setWindowDecorationStyle(JRootPane.QUESTION_DIALOG);
		layar.setVisible(true);
		
		JFrame layarInfo = new JFrame();
		layarInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layarInfo.setSize(200,200); // ( Width , Height)

		
		layarInfo.setLocation(0, 200);	// (x , y)
		layarInfo.setResizable(false);
		layarInfo.setTitle("::ANJING::");
		layarInfo.setUndecorated(true);
		layarInfo.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		layarInfo.setVisible(true);
		
		JFrame layarAlert = new JFrame();
		layarAlert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layarAlert.setSize(200,200); // ( Width , Height)

		
		layarAlert.setLocation(0, 400);	// (x , y)
		layarAlert.setResizable(false);
		layarAlert.setTitle("::ANJING::");
		layarAlert.setUndecorated(true);
		layarAlert.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);
		layarAlert.setVisible(true);
		
		JFrame layarEror = new JFrame();
		layarEror.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layarEror.setSize(200,200); // ( Width , Height)

		
		layarEror.setLocation(0, 600);	// (x , y)
		layarEror.setResizable(false);
		layarEror.setTitle("::ANJING::");
		layarEror.setUndecorated(true);
		layarEror.getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);
		layarEror.setVisible(true);
		
	}

}
