import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Test10 {

    @Test
    public void 問題1() {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(123);
        intList.add(4567);
        intList.add(89012);
        intList.add(345678);
        intList.add(9012345);
        intList.add(67);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Station10.q1(intList);

        StringBuilder expected = new StringBuilder();
        expected.append("      123\n");
        expected.append("    4,567\n");
        expected.append("   89,012\n");
        expected.append("  345,678\n");
        expected.append("9,012,345\n");
        expected.append("       67\n");
        assertEquals(expected.toString(), baos.toString());
    }
}
