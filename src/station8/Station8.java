import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Station8 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }
    public static HashSet<String> aggregateUserId(ArrayList<Order> orders) {
        // 問題1: ここから
    	HashSet<String> userIds = new HashSet<>();
        for (Order order : orders) {
            userIds.add(order.userId);
        }
        return userIds;
    	// 問題1: ここまで
		
    }

    public static HashMap<String, Integer> aggregateUserAndTotalPrice(ArrayList<Order> orders) {
        // 問題2: ここから
    	 HashMap<String, Integer> userPriceMap = new HashMap<>();
         for (Order order : orders) {
             userPriceMap.put(order.userId, userPriceMap.getOrDefault(order.userId, 0) + order.totalPrice);
         }
         return userPriceMap;
        // 問題2: ここまで	
    }
}
