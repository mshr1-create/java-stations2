import java.util.ArrayList;
import java.util.Iterator;

public class Station10 {

    public static void q1(ArrayList<Integer> list) {
        // ここから
        ArrayList<String> formattedNumbers = new ArrayList<>();

        int maxWidth = 0;
        for(int num : list ){
            String formatted = String.format("%,d", num);
            formattedNumbers.add(formatted);
            if (formatted.length() > maxWidth) {
                maxWidth = formatted.length();
            }
        }

        for (int i = 0; i < formattedNumbers.size(); i++) {
            String fNum = formattedNumbers.get(i);
            // 右寄せ整形後の出力を一旦printで出力（最後にprintlnで改行するため）
            System.out.println(String.format("%" + maxWidth + "s", fNum));
            // // 最後の要素出ない場合、改行を追加
            // if (i != formattedNumbers.size() - 1) {
            //     System.out.println();
            // }
        }
        // ここまで
    }
}

// for(int i = 0; i < list.size(); i++ ){
        //     System.out.println(String.format("%,10d", list.get(i)));
        // }

