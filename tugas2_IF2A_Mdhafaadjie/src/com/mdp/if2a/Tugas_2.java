package com.mdp.if2a;

import java.util.ArrayList;

import com.mdp.model.*;

public class Tugas_2 {

	public static void main(String[] args) {
		
		Sekolah sklsd = new Sekolah("SD Negeri 2 Palembang", "Jalan Garuda Putra No.1, 20 Ilir D. IV, Ilir Timur I, Palembang City, South Sumatra 30151", "https://maps.app.goo.gl/FmGuc1UmnLH5fxuBA");
		Sekolah sklsmp = new Sekolah("SMP Negeri 3 Palembang", "Jl. Ariodillah No.2280, 20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30128", "https://maps.app.goo.gl/MBcbRstNfAEEES2o7");
		Sekolah sklsma = new Sekolah("SMK Negeri 2 Palembang", "Jl. Demang Lebar Daun, 20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30151", "https://maps.app.goo.gl/ajWzqkXS8t8Awjz47");
		Sekolah [] skl = new Sekolah[4];
		skl[0] = new Sekolah("MAN 3 Palembang", "Jl. Inspektur Marzuki No.1, Siring Agung, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30151", "https://maps.app.goo.gl/2SP8bFxue5HmktHJA");
		skl[1] = new Sekolah("SD Muhammadiyyah 14 Palembang", "Jl. Kolonel H. Barlian No.1466, Ario Kemuning, Sukmajaya, Kota Palembang, Sumatera Selatan 30151", "https://maps.app.goo.gl/xNaS8g5jx6f44UaS7");
		skl[2] = new Sekolah("SMP Negeri 19 Palembang", "Jl. Srijaya No.628, Srijaya, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30151", "https://maps.app.goo.gl/udopNsRMeHqA1EfNA");
		skl[3] = new Sekolah("SMA Negeri 17 Plus Palembang", "3P5X+93G, Jalan Mayor Zurbi Bustan Pipa Jaya Kecamatan Kemuning, Kelurahan:, Sukajaya, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961", "https://maps.app.goo.gl/RN7RENjC8rtCs5Yt7");		
		
		Dosen [] dos = new Dosen[5];
		dos[0] = new Dosen("Mike Tyson", "Pria", "19230091");
		dos[1] = new Dosen("Arnold Schwarznegger", "Pria", "19240071");
		dos[2] = new Dosen("Emma Watson", "Wanita", "20050190");
		dos[3] = new Dosen("Mary Jane", "Wanita", "21040091");
		dos[4] = new Dosen("LeBron James", "Wanita", "20081210");

		ProgramStudi [] prodi = new ProgramStudi[3];
		prodi[0] = new ProgramStudi("Informatika", "S1", dos[2]);
		prodi[1] = new ProgramStudi("Teknik Komputer", "D3", dos[1]);
		prodi[2] = new ProgramStudi("Biofarma", "S1", dos[0]);
		
		ArrayList<Mahasiswa> mhs = new ArrayList<>();
		mhs.add(new Mahasiswa("M. Dhafa Adjie Saputra", "Pria", "2327250081", "Islam", prodi[0], dos[4], sklsd, sklsmp, sklsma));
		mhs.add(new Mahasiswa("Peter Walemark", "Pria", "149082001", "Atheist", prodi[2], dos[0], skl[1], skl[2], skl[0]));
		mhs.add(new Mahasiswa("Alejandro Garnacho", "Pria", "23090012", "Katolik", prodi[1], dos[3], sklsd, sklsmp, skl[3]));
		
		for (Mahasiswa i : mhs) {
			i.tampil();
		}

	}

}
