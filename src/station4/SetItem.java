import java.util.ArrayList;

public class SetItem extends Item{
	ArrayList<Item> items = new ArrayList<Item>();
	
    // 引数なしのデフォルトコンストラクター
    public SetItem() {
        super("デフォルトセット商品名"); // デフォルトの名前を設定
        // デフォルトのアイテムリストを作成
        items.add(new Item("デフォルト商品1"));
        items.add(new Item("デフォルト商品2"));
    }
	
	
	// コンストラクタ
	public SetItem(String name, ArrayList<Item> items) {
		super(name);
		this.items = items;
	}
	@Override
	public String getName() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName()).append("(");
		
		
		for (int i = 0; i < items.size(); i++) {
			sb.append(items.get(i).getName());
			if (i < items.size() - 1) {
				sb.append(",");
			}
		}
		
		sb.append(")");
		return sb.toString();
		
	}

}


	


