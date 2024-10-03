import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Test11 {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void 問題() throws IOException {
        int number = new Random().nextInt(10000);
        File source = tempFolder.newFile();
        Files.write(
                source.toPath(),
                String.valueOf(number).getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
        );
        File dest = tempFolder.newFile();

        Station11.q1(source.toPath(), dest.toPath());

        String answer = Files.readString(dest.toPath());

        Assert.assertEquals(String.valueOf(number * 2), answer);
    }
}
