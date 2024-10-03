import org.junit.Test;

import static org.junit.Assert.*;

public class Test3 {

    @Test
    public void 問題1_nullの時にfalseを返す() {
        assertFalse(Station3.checkEmailAddress(null));
    }

    @Test
    public void 問題1_空文字の時にfalseを返す() {
        assertFalse(Station3.checkEmailAddress(""));
    }

    @Test
    public void 問題1_アットマークがない時にfalseを返す() {
        assertFalse(Station3.checkEmailAddress("test.com"));
    }

    @Test
    public void 問題1_問題無い時にtrueを返す() {
        assertTrue(Station3.checkEmailAddress("test@example.com"));
    }

    @Test
    public void 問題2_nullの時に代入される() {
        User user = new User();
        Station3.q2(user);
        assertEquals("未設定", user.name);
    }

    @Test
    public void 問題2_nullではない時に代入されない() {
        User user = new User();
        user.name = "名前";
        Station3.q2(user);
        assertEquals("名前", user.name);
    }
}
