package com.sravanit.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileAPIChanges {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		/*
		 * FileInputStream fis = new FileInputStream( new
		 * File("D:\\MyWork\\Java11-WorkSpace\\05_FileAPIChanges\\resources\\sample.txt"
		 * )); ObjectInputStream obj = new ObjectInputStream(fis);
		 * System.out.println(obj.readObject());
		 */

		BufferedReader br = new BufferedReader(
				new FileReader("D:\\MyWork\\Java11-WorkSpace\\05_FileAPIChanges\\resources\\sample.txt"));
		String s = null;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}

		System.out.println("***********************");

		Path p = Path.of("D:\\MyWork\\Java11-WorkSpace\\05_FileAPIChanges\\resources\\sample.txt");
		System.out.println(Files.readString(p));
		Files.writeString(p, "\n Sravan adding to exsist file", StandardOpenOption.APPEND);
		Files.writeString(Path.of("D:\\MyWork\\Java11-WorkSpace\\05_FileAPIChanges\\resources\\test.txt"),
				"This is test file write using java 11", StandardOpenOption.CREATE);

	}

}
