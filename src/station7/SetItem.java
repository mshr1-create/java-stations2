import java.util.ArrayList;

public class SetItem implements Item {
	
	String name = null;
	ArrayList<SingleItem> items = new ArrayList<SingleItem>();
	
	@Override
	public String getName() {
		StringBuilder sb = new StringBuilder();
        sb.append(name).append("(");
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