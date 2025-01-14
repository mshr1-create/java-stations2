final class Item {
    final int id;
    final String name;
    final int stock;

    Item(final int id, final String name,final int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    final String getDisplayText() {
        final String stockInfo = stock > 0 ? "In stock" : "Out of stock";
        return name + " (" + stockInfo + ")";
    }
}

// public class Item {
//     private int id;
//     private String name;
//     private int stock;

//      Item(int id, String name, int stock) {
//         this.id = id;
//         this.name = name;
//         this.stock = stock;
//     }

//     String getDisplayText() {
//         String stockInfo = stock > 0 ? "In stock" : "Out of stock";
//         return name + " (" + stockInfo + ")";
//     }
// }
