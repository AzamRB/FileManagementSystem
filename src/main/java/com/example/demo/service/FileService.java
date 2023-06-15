package com.example.demo.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.FileEntity;
import com.example.demo.repository.FileRepository;

@Service
public class FileService {

	@Autowired
	private FileRepository fileRepository;
	
	public void uploadFile(MultipartFile file) throws IOException {
		
		if(file.isEmpty()) {
			throw new IllegalArgumentException("File is empty");
		}
		
		//create new file
		FileEntity fileEntity = new FileEntity();
		fileEntity.setFileName(file.getName());
		fileEntity.setFileData(file.getBytes());
		
		//save file entity in database
		
		this.fileRepository.save(fileEntity);

	}
}
