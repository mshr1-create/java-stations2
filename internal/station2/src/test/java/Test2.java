import org.junit.Test;

@SuppressWarnings("unused")
public class Test2 {

    @Test
    public void getメソッドが正しく定義されている() {
        Integer r1 = new Cache<String, Integer>().get("");
        String r2 = new Cache<Integer, String>().get(1);
    }

    @Test
    public void putメソッドが正しく定義されている() {
        new Cache<String, Integer>().put("", 1);
        new Cache<Integer, String>().put(1, "");
    }
}
