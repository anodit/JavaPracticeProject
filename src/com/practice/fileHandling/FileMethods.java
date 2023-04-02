package com.practice.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = 0;
		File f = new File("//Users//mohit//Documents//JavaScript_Learning");
		String[] s = f.list();
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f);
		for(String s1 : s) {
			System.out.println("s1-> "+s1);
			count++;
		}
		System.out.println("No of Files/Directory Count -> "+count);
	}

}
