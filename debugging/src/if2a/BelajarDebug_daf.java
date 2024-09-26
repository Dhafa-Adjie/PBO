package if2a;

public class BelajarDebug_daf {

	public static void main(String[] args) {
		int max = 100, min = 0; 
		for(int i = max ; i >= min ; i--) {
			try {
				Thread.sleep(1000);
				System.out.println("Iterasi ke-"+i);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			if (i == 60) {
				System.out.println("Roket itu akan mendarat 1 menit lagi");
			} else if (i == 90) {
				System.out.println("Roket mendarat dalam 1 menit 30 detik lagi");
			}
		}
	}

}
