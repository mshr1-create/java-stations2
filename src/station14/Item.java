public class Item {
    private int id;
    private String name;
    private int stock;

    public Item(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    String getDisplayText() {
        String stockInfo = stock > 0 ? "In stock" : "Out of stock";
        return name + " (" + stockInfo + ")";
    }
}
