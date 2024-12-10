import java.util.ArrayList;

public class MainItem {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 個々のアイテムを作成
        Item item1 = new Item("カレー");
        Item item2 = new Item("うどん");
        Item item3 = new Item("そば");
        
     // アイテムのリストを作成
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        
     // セットアイテムを作成
        SetItem setItem = new SetItem("セット商品", itemList);
        
     // getName()メソッドの動作確認
        System.out.println(setItem.getName());
        // 出力: セット商品（カレー、うどん、そば）
	}

}
