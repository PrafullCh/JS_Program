import java.io.*;
public class FileUsingByteStream{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream out = new FileOutputStream("file-3.txt");
        String s = "File written using Byte Stream";
        out.write(s.getBytes());
        out.close();
        FileInputStream in = new FileInputStream("file-3.txt");
        int i;
        while((i= in.read())!=-1)
        {
            System.out.print((char)i);
        }
        in.close();
    }
}