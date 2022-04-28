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
            List<String> expected = List.of("youtube.com");
            assertEquals(expected, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
