package com.bookstore.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.web.multipart.MultipartFile;

public class FileSaveService {
	private String imagesFolder;

	public void setImagesFolder(String imagesFolder) {
		this.imagesFolder = imagesFolder;
	}

	public String fileUpload(MultipartFile file) {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		// MultipartFile file = uploadedFile.getFile();
		String fileName = file.getOriginalFilename();
		File newFile = new File(imagesFolder + fileName);

		try {
			inputStream = file.getInputStream();

			if (!newFile.exists()) {
				newFile.createNewFile();
			}
			outputStream = new FileOutputStream(newFile);
			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return newFile.getAbsolutePath();
	}
}
