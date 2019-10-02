import java.io.*;
public class FilesUsingCharStream{
    public static void main(String[] args)throws IOException
    {
        FileWriter fw = new FileWriter("file-2.txt");
        fw.write("File written using Filwriter");
        fw.close();
        FileReader fr = new FileReader("file-2.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
}