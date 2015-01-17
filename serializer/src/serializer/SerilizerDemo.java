package serializer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizerDemo {
	
	public static void main(String[] args) throws Exception{
		Myserializer myserial = new Myserializer("BookStore", "Ebn Gverold 9", 34);
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Myserializer"));
			oos.writeObject(myserial);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			oos.close();
			System.out.println("file is closed");
		}
		
		
		ObjectInputStream ois = null;
		Myserializer myserializer1 = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("Myserializer"));
			myserializer1 = (Myserializer)ois.readObject();
		}catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}finally{
			ois.close();
			System.out.println("file is closed");
		}
		
		System.out.println(myserializer1);
	}
}
