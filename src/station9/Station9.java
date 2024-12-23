import java.util.ArrayList;
import java.util.Random;

public class Station9 {

    public static String printOrder(ArrayList<Item> itemList, Random random) {
        // ここから

        StringBuilder sb = new StringBuilder();
        int totalPrice = 0;
        
        for (int i = 0; i < itemList.size(); i++){
            Item item = itemList.get(i);
            sb.append(item.name)
              .append(" ")
              .append(item.price)
              .append("円\n");
            totalPrice += item.price;
        }

        int r = random.nextInt(100);
        if(r % 50 == 0 || r == 0){
            sb.append("合計")
            .append(" ")
            .append(0)
            .append("円\n");
            sb.append("1等: 全額キャッシュバック");
            
        }else if(r % 10 == 0){
            sb.append("合計")
            .append(" ")
            .append(totalPrice)
            .append("円\n");
            sb.append("2等: 10%キャッシュバック");
        }else{
            sb.append("合計")
            .append(" ")
            .append(totalPrice)
            .append("円\n");
        }
        
        return sb.toString();
        // ここまで
    }
}
