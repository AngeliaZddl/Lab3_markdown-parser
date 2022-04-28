import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class MarkdownParseTestRobert {

    @Test
    public void addition() throws IOException {
        assertEquals(2, 1 + 1); //works
    }

    @Test
    public void testfile() {
        try {
            List<String> actual = MarkdownParse.getLinks(new Scanner(new File("robert-test-1.md")));
            List<String> expected = List.of("https://youtube.com");
            assertEquals(expected, actual);
            List<String> actual2 = MarkdownParse.getLinks(new Scanner(new File("robert-test-2.md")));
            List<String> expected2 = List.of();
            assertEquals(expected2, actual2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
