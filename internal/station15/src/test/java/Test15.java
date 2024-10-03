import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class Test15 {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    public void publicなメソッドが全て定義されているかどうか() {
        Item item = new Item();
        item.getId();
        item.getName();
        item.getStock();
        item.updateStock(0);
    }

    @Test
    public void privateなフィールドが全て定義されているかどうか() {
        try {
            Field field = Item.class.getDeclaredField("id");
            if (!field.getType().equals(int.class)) {
                fail("idフィールドの型がintではありません");
            }
            assertFalse("idフィールドがprivateではありません", field.canAccess(new Item()));
        } catch (NoSuchFieldException e) {
            fail("idフィールドが定義されていません");
        }
        try {
            Field field = Item.class.getDeclaredField("name");
            if (!field.getType().equals(String.class)) {
                fail("nameフィールドの型がStringではありません");
            }
            assertFalse("nameフィールドがprivateではありません", field.canAccess(new Item()));
        } catch (NoSuchFieldException e) {
            fail("nameフィールドが定義されていません");
        }
        try {
            Field field = Item.class.getDeclaredField("stock");
            if (!field.getType().equals(int.class)) {
                fail("stockフィールドの型がintではありません");
            }
            assertFalse("stockフィールドがprivateではありません", field.canAccess(new Item()));
        } catch (NoSuchFieldException e) {
            fail("stockフィールドが定義されていません");
        }
    }
}
