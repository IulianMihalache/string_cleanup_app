import java.io.*;

public class String_APP{
    public FileReader f = null;
    public void main() throws IOException{
        StringBuilder buffer = new StringBuilder();
        int c;
        try{

            f = new FileReader("string.txt");
            while((c = f.read()) != -1){
                buffer.append((char) c);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        System.out.println(buffer);
    }
}