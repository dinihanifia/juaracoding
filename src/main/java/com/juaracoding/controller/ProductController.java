package com.juaracoding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.model.ProductModel;

//DAY 2
//DAY 2
//DAY 2

@RestController
@RequestMapping ("/endpoint")
public class ProductController {
//	localhost:3031/endpoint/indomie
	ProductModel arrayProduct1 = new ProductModel("Indomie",2500,"Bandung");
	ProductModel arrayProduct2 = new ProductModel("Mie Sedaap",3500,"Surabaya");
	ProductModel arrayProduct3 = new ProductModel("Mie Sukses",2800,"Solo");
	
	ProductModel[] daftarProduct = {arrayProduct1,arrayProduct2,arrayProduct3};
	
	@GetMapping ("/{merk}")
	private ProductModel getMappingMerk(@PathVariable("merk")String merk) {
		for (int i=0;i<=daftarProduct.length;i++) {
			if(daftarProduct[i].getMerk().equalsIgnoreCase(merk)) {
				return daftarProduct[i];
			}
		}
		return null;
	}
}
