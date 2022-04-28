import static org.junit.Assert.*;
import org.junit.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


/**
 * Matthew's test cases for MarkdownParser.java
 * @author Matthew Vandenberg
 */
public class MarkdownParseTestMatthew {
    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }

    @Test
    public void testGetLinks() {
        try {
            List<String> actual = MarkdownParse.getLinks(new Scanner(new File("robert-test-1.md")));
            List<String> expected = List.of("https://youtube.com");
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
