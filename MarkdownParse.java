//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class MarkdownParse {
    private static final String[] VALID_CHARS = {"(", ")", "[", "]"};

    public static ArrayList<String> getLinks(Scanner reader) {
        ArrayList<String> list = new ArrayList<>();
        while (reader.hasNextLine()) {
            String currentLine = reader.nextLine();
            do {
                if (currentLine.length() == 0) continue;
                // Ensure that line isn't an image
                if (currentLine.charAt(0) == '!') continue;
                // Let's make sure all characters ('[', ']', '(', ')') exist in string
                int counter = 0;
                for (String character : VALID_CHARS) {
                    if (currentLine.contains(character)) {
                        counter++;
                    }
                }
                // If we don't find all the characters, we know this line doesn't contain a link
                if (counter != 4) break;
                // Make sure that the link characters are in the correct order
                int startSquareBracket = currentLine.indexOf("[");
                if (startSquareBracket == -1) continue;
                int endSquareBracket = currentLine.indexOf("]", startSquareBracket);
                if (endSquareBracket == -1) continue;
                int startParenthesis = currentLine.indexOf("(", endSquareBracket);
                if (startParenthesis == -1) continue;
                int endParenthesis = currentLine.indexOf(")", startParenthesis);
                if (endParenthesis == -1) continue;
                String link = currentLine.substring(startParenthesis + 1, endParenthesis);
                list.add(link);
                currentLine = currentLine.substring(endParenthesis + 1);
                
            } while (currentLine.length() != 0);
        }
        return list;
    }


    public static void main(String[] args) throws IOException {
        if (args[0] == null) {
            throw new IOException("No file specified");
        }
        File file = new File(String.valueOf(args[0]));
        Scanner reader = new Scanner(file);
        System.out.println(getLinks(reader));
        reader.close();
    }
}