import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Test7 {

    @Test
    public void SingleItemクラスのgetNameメソッドでnameフィールドの値を返している() {
        SingleItem item = createSingleItem("アイテム名");
        assertEquals("アイテム名", item.getName());
    }

    @Test
    public void SetItemクラスのgetNameメソッドで正しい値を返している() {
        SetItem item = new SetItem();
        item.name = "セットアイテム";
        ArrayList<SingleItem> items = new ArrayList<>();
        items.add(createSingleItem("アイテム1"));
        items.add(createSingleItem("アイテム3"));
        items.add(createSingleItem("アイテム4"));
        items.add(createSingleItem("アイテム2"));
        item.items = items;
        assertEquals("セットアイテム(アイテム1,アイテム3,アイテム4,アイテム2)", item.getName());
    }

    @Test
    public void 継承関係が正しい() {
        assertTrue("Itemがインターフェースではありません。", Item.class.isInterface());
        assertTrue("SingleItemがItemを実装していません。", Item.class.isAssignableFrom(SingleItem.class));
        assertTrue("SetItemがItemを継承していません。", Item.class.isAssignableFrom(SetItem.class));

        assertFalse("SingleItemがSetItemを継承しています。", SetItem.class.isAssignableFrom(SingleItem.class));
        assertFalse("SetItemがSingleItemを継承しています。", SingleItem.class.isAssignableFrom(SetItem.class));
    }

    private SingleItem createSingleItem(String name) {
        SingleItem item = new SingleItem();
        item.name = name;
        return item;
    }
}
