import java.io.*;
class Student1{
		public static void main(String args[]) throws Exception
		{
			Student o ;
			FileInputStream fin = new FileInputStream("file_1.ser");
			ObjectInputStream oin = new ObjectInputStream(fin);
			o = (Student) oin.readObject();
			o.display();
 		}
}