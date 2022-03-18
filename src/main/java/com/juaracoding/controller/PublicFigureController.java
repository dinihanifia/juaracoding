package com.juaracoding.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.juaracoding.model.PublicFigureModel;
import com.juaracoding.utility.FileUtility;

@RestController
@RequestMapping("/figure")
public class PublicFigureController {
	
	List<PublicFigureModel>model = new ArrayList<>();
	
//	localhost:3030/figure
//	endpointnya untuk save model beserta gambarnya
//	@PostMapping("/")
//	private String saveData(@RequestParam(name="file")MultipartFile file)throws Exception {
//		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//		String uploadDir = "foto-figure";
//		FileUtility.simpanFile(uploadDir, fileName, file);
//		return "Berhasil disimpan";
//	}
	
	@PostMapping("/")
	private String saveData(@RequestParam(name="file")MultipartFile file,
			@RequestParam(name="data") String figureModel)throws Exception {
		Gson gson = new Gson();
		PublicFigureModel figure = gson.fromJson(figureModel, PublicFigureModel.class);
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		String uploadDir = "foto-figure";
		
		figure.setFoto(fileName);
		FileUtility.simpanFile(uploadDir, fileName, file);
		model.add(figure);
		
		return "Berhasil disimpan";
	}

}
