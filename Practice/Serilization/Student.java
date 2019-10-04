import java.io.*;
public class Student implements Serializable{
	public String name;
	public int rollno;
	public Student(String n,int r){
		this.name = n; 
		this.rollno = r;
	}
	public void display(){
		System.out.println("Name is "+name+" RollNo is "+rollno);
	}
	public static void main(String args[])throws Exception {
		Student s = new Student("Prafull",176110);
		FileOutputStream fin = new FileOutputStream("file_1.ser");
		ObjectOutputStream oin = new ObjectOutputStream(fin);
		oin.writeObject(s);
		s.display();
	}
}
