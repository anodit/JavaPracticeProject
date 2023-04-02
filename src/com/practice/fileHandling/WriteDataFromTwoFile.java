package com.practice.fileHandling;

import java.io.*;

public class WriteDataFromTwoFile {
	public static void main(String[] args) throws IOException {
		File f1 = new File("f1.txt");
		File f2 = new File("f2.txt");
		f1.createNewFile();
		f2.createNewFile();
		BufferedWriter fw1 = new BufferedWriter(new FileWriter(f1));
		BufferedWriter fw2 = new BufferedWriter(new FileWriter(f2));
		fw1.write("First File name is F1.txt");
		fw1.newLine();
		fw1.write("Calling from F1 using BufferedWriter");
		fw2.write("Second File name is F2.txt");
		fw2.newLine();
		fw2.write("Calling from F2 using BufferedWriter");
		fw1.flush();
		fw2.flush();
		fw1.close();
		fw2.close();
		PrintWriter pw = new PrintWriter(new File("f3.txt"));
		BufferedReader fr1 = new BufferedReader(new FileReader(f1));
		BufferedReader fr2 = new BufferedReader(new FileReader(f2));
		String s1 = fr1.readLine();
		String s2 = fr2.readLine();
		while(s1!=null) {
			pw.write(s1);
			s1 = fr1.readLine();
		}
		while(s2!=null) {
			pw.write(s2);
			s2 = fr2.readLine();
		}
		fr1.close();
		fr2.close();
		pw.flush();
		pw.close();
	}
}
