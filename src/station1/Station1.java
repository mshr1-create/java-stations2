import java.util.ArrayList;

public class Station1 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Tech");
        list.add("Train");
        list.add("Railway");
        
        ArrayList<String> searchWords = new ArrayList<String>();
        
        searchWords.add("Railway");
        searchWords.add("Tech");
        searchWords.add("Station");
        
        // q2メソッドを呼び出し、結果を取得
        int result = q2(list, searchWords);

        // 結果を出力
        System.out.println("一致する単語の数: " + result);
        
    }

    public static ArrayList<String> q1() {
       // 問題1: ここから
    	
        ArrayList<String> q1 = new ArrayList<String>();

        q1.add("Tech");
        q1.add("Train");

        return q1;
       // 問題1: ここまで
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
       // 問題2: ここから
        int num = 0;

        for (int i = 0; i < list.size(); i++){
            for (int j = 0; j < searchWords.size(); j++){
                if (list.get(i).equals(searchWords.get(j))){
                    num++ ;
                }
            }
        }
        
        return num;
 
//         // 問題2: ここまで
    }
}
