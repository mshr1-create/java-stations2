import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Station11 {

    public static void q1(Path inputFile, Path outputFile) {
        // ここから
        // inputFile に格納された文字列を読み込んで、String型のtextに格納する。
        String text = null; 
        try {
            text = Files.readString(inputFile);
        } catch (IOException e) {
            System.out.println("読み込みに失敗しました");
        }

        // text に格納された文字列を数値に変換して、2倍した値を `answer` に格納する。   
        int number = Integer.parseInt(text);

        // 2倍した値を文字列に変換して、outputFile に書き込む。
        try {
            Files.writeString(outputFile, String.valueOf(number * 2), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.out.println("書き込みに失敗しました");
        }

        // ここまで
    }
}
