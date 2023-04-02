package com.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable{
	private static final long serialVersionUID = 1L;
	int i=10;
	int j=20;
}

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test t = new  Test();
		//Serialization
		FileOutputStream fos = new FileOutputStream("abc.ser");
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(t);
		}catch (Exception e) {
			e.printStackTrace();
		}
		//De-Serialization
		FileInputStream fis = new FileInputStream("abc.ser");
		try (ObjectInputStream ois = new ObjectInputStream(fis)){
			Test t1 = (Test)ois.readObject();
			System.out.println("Test obj i,j-> "+t1.i +" , "+t1.j);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
