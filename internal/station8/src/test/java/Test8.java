import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test8 {

    @Test
    public void 問題1_ユーザーのIDが正しく格納されている() {
        ArrayList<Order> orders = new ArrayList<Order>();
        orders.add(createOrder("1", "user1", 1000));
        orders.add(createOrder("2", "user2", 2000));
        orders.add(createOrder("3", "user1", 3000));
        orders.add(createOrder("4", "user3", 4000));
        orders.add(createOrder("5", "user1", 5000));

        HashSet<String> userIdSet = Station8.aggregateUserId(orders);

        assertEquals("ユーザーIDの数が正しくありません", 3, userIdSet.size());
        assertTrue("user1が含まれていません", userIdSet.contains("user1"));
        assertTrue("user2が含まれていません", userIdSet.contains("user2"));
        assertTrue("user3が含まれていません", userIdSet.contains("user3"));
    }

    @Test
    public void 問題2_ユーザーごとの合計金額が正しく格納されている() {
        ArrayList<Order> orders = new ArrayList<Order>();
        orders.add(createOrder("1", "user1", 1000));
        orders.add(createOrder("2", "user2", 2000));
        orders.add(createOrder("3", "user1", 3000));
        orders.add(createOrder("4", "user3", 4000));
        orders.add(createOrder("5", "user1", 5000));

        HashMap<String, Integer> map = Station8.aggregateUserAndTotalPrice(orders);

        assertEquals("ユーザーごとの合計金額の数が正しくありません", 3, map.size());
        assertEquals("user1の合計金額が正しくありません", 9000, map.get("user1").intValue());
        assertEquals("user2の合計金額が正しくありません", 2000, map.get("user2").intValue());
        assertEquals("user3の合計金額が正しくありません", 4000, map.get("user3").intValue());
    }

    private Order createOrder(String id, String userId, int totalPrice) {
        Order order = new Order();
        order.id = id;
        order.userId = userId;
        order.totalPrice = totalPrice;
        return order;
    }

}
