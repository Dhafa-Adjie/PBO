package if2a;

import javax.swing.JOptionPane;

class Laptop implements Computerable{ // Menggunakan implements
	@Override
	public void startUp() {
		System.out.println("Laptop Sedang Dinyalakan");
	}

	@Override
	public void standBy() {
		System.out.println("Laptop Sedang Menyala");		
	}

	@Override
	public void shutDown() {
		System.out.println("Laptop Sedang Dimatikan");		
	}
}

class Foo {}
interface Inner1 {}
interface Inner2{}
//class Fii implements Foo{} 	// Kelas tidak bisa implementasi Kelas 
//interface Inter1 implements Inner2{} 		// Interface tidak bisa implementasi Interface


public class Belajar_Interface_mDA {

	public static void main(String[] args) {
		System.out.println("================================="); 
		Laptop hp = new Laptop();
		hp.startUp();
		hp.standBy();
		hp.shutDown();
		
////		JOptionPane.showMessageDialog(null, "Welcome");
//		JOptionPane.showConfirmDialog(null, "Kuliah", null , 0);
//		JOptionPane.showInternalConfirmDialog(null, "Welcome",null , 2);
//		JOptionPane.showInternalConfirmDialog(null, "Konci?",null , JOptionPane.OK_CANCEL_OPTION);
		
		 int jawa;
         String outputStr1;
         String outputStr2;

         jawa = JOptionPane.showInternalConfirmDialog(null, "Mau makan? :3",null , JOptionPane.YES_NO_OPTION);
         
         outputStr1 = "Ayoook";
         outputStr2 = "Nginjek Paku";

         if (jawa == 0) {
             String tempat = JOptionPane.showInputDialog ( "Makan dimana?" );
             String lok = outputStr1 + tempat + "Nanti tengah malam";
             JOptionPane.showMessageDialog(null, lok);
         }
         else {
        	 JOptionPane.showMessageDialog(null, outputStr2, "Gas", JOptionPane.INFORMATION_MESSAGE);
         }
            
	}

}
