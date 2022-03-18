package com.juaracoding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.model.MobilModel;

//DAY 2
//DAY 2
//DAY 2

@RestController
@RequestMapping("/mobil")
public class MobilController {
	MobilModel arraymobil1 = new MobilModel("Daihatsu","Hijet",1985);
	MobilModel arraymobil2 = new MobilModel("Toyota","Camry",2016);
	MobilModel arraymobil3 = new MobilModel("Daihatsu","Taft",1992);
	MobilModel arraymobil4 = new MobilModel("Suzuki","4x4",2008);
	MobilModel arraymobil5 = new MobilModel("BMW","320i",2020);
	
	MobilModel[] daftarMobil = {arraymobil1,arraymobil2,arraymobil3,arraymobil4,arraymobil5};
	
	@GetMapping("/carimobil/{indeks}")
	private MobilModel getMappingDaftarMobil(@PathVariable("indeks") int indeks) {
		return daftarMobil[indeks];
		
	}
	
//	localhost:3031/mobil/requestparam?data=mantab&data2=anuan&data3=asiq
	@GetMapping("/requestparam")
	private String getDataRequestParam(@RequestParam(name ="data",defaultValue = "trainernya ganteng") String data,
			@RequestParam(name ="data2",defaultValue = "juaracoding mantap") String data2,
			@RequestParam(name ="data3",defaultValue = "anuan") String data3) {
		return data+data2+data3;
	}
	
	
//	@PostMapping("/")
//	public MobilModel saveAndGetMobil(@RequestBody MobilModel data) {
//		data.setTahun(1999);
//		return data;
//
//	}
	
//	Get Mapping Sederhana sederhana dengan endpoint / aksesnya localhost:3032/mobil/
	@GetMapping("/")
	private int get() {
		return 100;
		
	}
	
//	Get Mapping Sederhana sederhana dengan endpoint / aksesnya localhost:3032/mobil/endpoint2
	@GetMapping("/endpoint2")
	private int get1() {
		return 0;
		
	}
	
//	Get Mapping Sederhana sederhana dengan endpoint / aksesnya localhost:3032/mobil/dini
	@GetMapping("/{nama}")
	private String getMappingPath(@PathVariable("nama") String nama) {
		return "Hello! " + nama;
	}
	

	@GetMapping("/panggil/{nama}")
	private String getMappingPath2(@PathVariable("nama")String nama,
			@RequestParam(name="data",defaultValue="trainer ganteng")String data) {
		char huruf=nama.charAt(0);
		return "Hello! " + nama + "huruf depannya = " +huruf+ " "+data;
	}
	
	@GetMapping("/{nama}/{umur}")
	private String getMappingPath(@PathVariable("nama") String nama, @PathVariable("umur") String umur) {
		return "Hello! " + nama + ". Umur anda adalah " + umur;
	}
	
//	@GetMapping("/{nama1}/{nama2}/{umur}")
//	private String getMappingPathNama1(@PathVariable("nama1") String nama1, @PathVariable("nama2") String nama2,@PathVariable("umur") String umur) {
//		if(nama1.length() < nama2.length()) {
//			return nama2;
//		} else {
//			return nama1;
//		}
//			
//	}
	
	@GetMapping("/{merk}/{tipe}/{tahun}")
	private MobilModel getMappingPathmerk(@PathVariable("merk") String merk, @PathVariable("tipe") String tipe,@PathVariable("tahun") int tahun) {
		MobilModel isian = new MobilModel();
		isian.setMerk(merk);
		isian.setTipe(tipe);
		isian.setTahun(tahun);
		return isian;
	}

}
