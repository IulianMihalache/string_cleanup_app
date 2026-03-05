import java.io.*;

public class String_APP{
    public FileReader f = null;

    public String removePunctuationAndDigits(StringBuilder text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public String removeMultipleSpaces(StringBuilder text) {
        StringBuilder result = new StringBuilder();
        boolean last_space = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                if (!last_space) {
                    result.append(c);
                    last_space = true;
                }
            } else {
                result.append(c);
                last_space = false;
            }
        }

        return result.toString();
    }

    public void main(String[] args) throws IOException{
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
        System.out.println(removePunctuationAndDigits(buffer));
        System.out.println(removeMultipleSpaces(buffer));
    }
}
