public class Station5 {
    public static void main(String[] args) {
        // ここから
        process();
        // ここまで
        System.out.println("処理が完了しました");
    }

    public static void process() {
        throw new RuntimeException();
    }
}
