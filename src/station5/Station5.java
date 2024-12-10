public class Station5  {
    public static void main(String[] args) {
        // ここから
    	try {
    		process();
    	}catch(RuntimeException e) {
    		System.out.println("エラーが発生しました");
    	}
        
        // ここまで
        System.out.println("処理が完了しました");
    }

    public static void process() {
        throw new RuntimeException();
    }
}
