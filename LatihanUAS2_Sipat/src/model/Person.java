package model;

public class Person {
	
    private String nama;
    private String kotaKelahiran;

    public Person() {
		
	}

	public Person(String nama, String kotaKelahiran) {
        this.nama = nama;
        this.kotaKelahiran = kotaKelahiran;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setKotaKelahiran(String kotaKelahiran) {
        this.kotaKelahiran = kotaKelahiran;
    }
    
    public String getKotaKelahiran() {
        return kotaKelahiran;
    }
    
}
