package com.practice.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
//		File f = new File("abc.txt");
//		System.out.println(f.exists());
//		f.createNewFile();
//		System.out.println(f.exists());
//		File fd = new File("abdDir");
//		System.out.println(fd.exists());
//		fd.mkdir();
//		System.out.println(fd.exists());
		
		File f = new File("abcDir");
		f.mkdir();
		File f1 = new File(f,"abc.txt");
		f1.createNewFile();
		System.out.println("f1 -> "+f1);
	}
}
