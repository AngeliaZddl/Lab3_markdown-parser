import static org.junit.Assert.*;
import org.junit.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


/**
 * Matthew's test cases for MarkdownParser.java
 * With makefile
 * @author Matthew Vandenberg
 */
public class MarkdownParseTestMatthew {
    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }

    @Test 
    public void testTwoInOneLine() {
        List<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(new Scanner(new File("matt-test-1.md"))));
    }

    
}
