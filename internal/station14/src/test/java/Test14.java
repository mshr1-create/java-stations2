import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Test14 {

    @Test
    public void 問題() throws IOException {
        File itemFile = new File("../../src/station14/Item.java").getCanonicalFile();
        Assert.assertTrue("Item.javaが存在しません", itemFile.exists());

        String code = Files.readString(itemFile.toPath());
        int finalCount = code.split("final ").length - 1;
        Assert.assertTrue("finalの個数が合っていません。", finalCount == 8 || finalCount == 9);
    }
}
