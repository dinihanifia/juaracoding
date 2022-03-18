package com.juaracoding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HandphoneModel {
	private String merk;
	private String tipe;
	private int harga;
	private double ukuranLayar;
	private String kamera;

}
