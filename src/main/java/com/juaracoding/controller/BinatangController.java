package com.juaracoding.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.model.BinatangModel;

@RestController
@RequestMapping("/binatang")
public class BinatangController {
	List <BinatangModel> binatangList = new ArrayList<>();
	
	@PostMapping("/")
	private String saveBinatang(@RequestBody BinatangModel binatang) {
		binatangList.add(binatang);
		return "Berhasil disimpan";
	}
	
//	@GetMapping("/")
//	private List<BinatangModel> getAllBinatang() {
//		return binatangList;
//	}
	
	@GetMapping("/caribinatang/{indeks}")
	private BinatangModel getMappingBinatang(@PathVariable("indeks")int indeks) throws Exception {
		try {
			return binatangList.get(indeks);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new Exception("ini gagal");
		}
}
	
}
