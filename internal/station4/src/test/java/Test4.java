import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Test4 {

    @Test
    public void ItemクラスのgetNameメソッドでnameフィールドの値を返している() {
        Item item = createItem("アイテム名");
        assertEquals("アイテム名", item.getName());
    }

    @Test
    public void SetItemクラスのgetNameメソッドで正しい値を返している() {
        SetItem item = new SetItem();
        item.name = "セットアイテム";
        ArrayList<Item> items = new ArrayList<>();
        items.add(createItem("アイテム1"));
        items.add(createItem("アイテム3"));
        items.add(createItem("アイテム4"));
        items.add(createItem("アイテム2"));
        item.items = items;
        assertEquals("セットアイテム(アイテム1,アイテム3,アイテム4,アイテム2)", item.getName());
    }

    private Item createItem(String name) {
        Item item = new Item();
        item.name = name;
        return item;
    }
}
