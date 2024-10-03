import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Random;

import static org.mockito.Mockito.doReturn;

public class Test9 {

    @Test
    public void 問題1_正しいアイテムリストが出力されている() {
        Random random = Mockito.mock(Random.class);
        doReturn(1).when(random).nextInt(100);

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(createItem("りんご", 100));
        itemList.add(createItem("みかん", 50));
        itemList.add(createItem("バナナ", 80));
        itemList.add(createItem("パイナップル", 200));
        String actual = Station9.printOrder(itemList, random);

        StringBuilder expected = new StringBuilder();
        expected.append("りんご 100円\n");
        expected.append("みかん 50円\n");
        expected.append("バナナ 80円\n");
        expected.append("パイナップル 200円\n");
        expected.append("合計 430円\n");

        Assert.assertEquals(expected.toString(), actual);
    }

    @Test
    public void 問題1_くじが正しく出力されている() {
        for (int i = 0; i < 100; i++) {
            Random random = Mockito.mock(Random.class);
            doReturn(i).when(random).nextInt(100);
            String expected;
            if (i % 50 == 0) {
                expected = "1等: 全額キャッシュバック";
            } else if (i % 10 == 0) {
                expected = "2等: 10%キャッシュバック";
            } else {
                expected = "";
            }
            String actual = Station9.printOrder(new ArrayList<>(), random);
            Assert.assertEquals("nextIntが" + i + "を返した時の結果が違います。", "合計 0円\n" + expected, actual);
        }
    }

    private static Item createItem(String name, int price) {
        Item item = new Item();
        item.name = name;
        item.price = price;
        return item;
    }
}
