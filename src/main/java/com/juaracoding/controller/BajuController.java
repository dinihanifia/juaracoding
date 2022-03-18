package com.juaracoding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.model.BajuModel;

// DAY 2
// DAY 2
// DAY 2

@RestController
public class BajuController {
	
//	localhost:3031/baju?merk
	@GetMapping ("/baju")
	private BajuModel getMappingBaju(@RequestParam(name="merk",defaultValue="H&M")String data1,
	@RequestParam(name="warna", defaultValue="Hitam")String data2,
	@RequestParam(name="ukuran", defaultValue="L")String data3,
	@RequestParam(name="harga", defaultValue="150000")int data4,
	@RequestParam(name="bentuk", defaultValue="Oversize")String data5) {
		BajuModel tipeBaju = new BajuModel(data1,data2,data3,data4,data5);
		return tipeBaju;
	}
	
//	localhost:3031/upsize?ukuran=S
	@GetMapping ("/upsize")
	private BajuModel getMappingBajuUpsize(@RequestParam(name="merk",defaultValue="Blanc&Enclare")String data1,
	@RequestParam(name="warna", defaultValue="Hitam")String data2,
	@RequestParam(name="ukuran", defaultValue="L")String data3,
	@RequestParam(name="harga", defaultValue="150000")int data4,
	@RequestParam(name="bentuk", defaultValue="Oversize")String data5) {
		BajuModel ukuranNaik = new BajuModel(data1,data2,data3,data4,data5);
		if (data3.equalsIgnoreCase("S")) {
			ukuranNaik.setUkuran("M");
			return ukuranNaik;
		}else if (data3.equalsIgnoreCase("M")) {
			ukuranNaik.setUkuran("L");
			return ukuranNaik;
		}else if (data3.equalsIgnoreCase("L")) {
			ukuranNaik.setUkuran("XL");
			return ukuranNaik;
		}else {
			return ukuranNaik;
		}
	}
	

}
