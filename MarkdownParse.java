// Reference (code for reading file was taken from the below link):
// https://www.geeksforgeeks.org/java-program-to-read-a-file-to-string/

// import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String mdStr) {
        // System.out.println(mdStr);
        ArrayList<String> links = new ArrayList<>();
        // TODO (Gerald): Add logic for this methoid here.
        int currentIndex = 0;
        while (currentIndex < mdStr.length()) {
            int openBracket = mdStr.indexOf("[", currentIndex);
            int closeBracket = mdStr.indexOf("]", openBracket);
            int openParen = mdStr.indexOf("(", closeBracket);
            int closeParen = mdStr.indexOf(")", openParen);
            // System.out.println(openBracket + ", " + closeBracket);
            // System.out.println(openParen + ", " + closeParen);
            String link = mdStr.substring(openParen + 1, closeParen);
            links.add(link);
            currentIndex = closeParen + 1;
        }  
        return links;
    }

    public static void main(String[] args) throws IOException {
        // read the markdown file and convert the contents to a string
   		Path fileName = Path.of("sample.md");
        String mdStr = Files.readString(fileName);
        // System.out.println(mdStr);
        // for (int i = 0; i < mdStr.length(); i++) {
        //     System.out.println(i + ": " + mdStr.charAt(i));
        // }
        ArrayList<String> mdLinks = getLinks(mdStr);
        System.out.println(mdLinks);
    }
}
