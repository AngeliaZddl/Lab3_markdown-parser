import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class MarkdownParseTestDevanshi {

    /**
     * Test cases for MarkdownParser.java : 
     * @author Devanshi Jain
     */
    @Test
    public void addition() throws IOException {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testfile() {
        try {
            List<String> actual = MarkdownParse.getLinks(new Scanner(new File("devanshi-test-1.md")));
            List<String> expected = List.of("https://something.com", "something.html");
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
