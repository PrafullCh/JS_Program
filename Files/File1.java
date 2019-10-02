import java.io.*;

class File1{
    public static void main(String[] ar)throws IOException{
        FileWriter in = new FileWriter("test.txt");
        in.write("Hello java");
        in.close();
    }
        
}