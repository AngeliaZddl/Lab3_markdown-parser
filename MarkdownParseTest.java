import static org.junit.Assert.*;
import org.junit.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }

    @Test
    public void testGetLinks() {
        try {
            List<String> actual = MarkdownParse.getLinks(new Scanner(new File("test-file.md")));
            List<String> expected = List.of("https://something.com", "some-thing.html");
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
