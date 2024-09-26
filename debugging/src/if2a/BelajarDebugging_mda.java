package if2a;

public class BelajarDebugging_mda {

	public static void main(String[] args) {
        HARI hari = HARI.SABTU;
        String ket = "";
        if(hari == HARI.SENIN){
            ket = "Monday";
        }
        else if(hari == HARI.SELASA){
            ket = "Tuesday";
        }
        else if(hari == HARI.RABU){
            ket = "Wednesday";
        }
        else if(hari == HARI.KAMIS){
            ket = "Thursday";
        }
        else if(hari == HARI.JUMAT){
            ket = "Friday";
        }
        else if(hari == HARI.SABTU){
            ket = "Saturday";
        }
        else if(hari == HARI.MINGGU){
            ket = "Sunday";
        }
        else {
            ket = "-";
        }

        System.out.println(ket);
    }

    enum HARI{
        SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
    }
    

}
