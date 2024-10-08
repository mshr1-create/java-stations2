import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Test1 {

    @Test
    public void 問題1_TechとTrainの2つの文字列をq1メソッドの返り値として返す() {
        ArrayList<String> list = Station1.q1();
        assertEquals(2, list.size());
        assertEquals("Tech", list.get(0));
        assertEquals("Train", list.get(1));
    }

    @Test
    public void 問題2_listとsearchWordsが同じ() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ArrayList<String> searchWords = new ArrayList<>();
        searchWords.add("A");
        searchWords.add("B");
        searchWords.add("C");
        assertEquals(3, Station1.q2(list, searchWords));
    }

    @Test
    public void 問題2_list側のみにある要素がある() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ArrayList<String> searchWords = new ArrayList<>();
        searchWords.add("A");
        assertEquals(1, Station1.q2(list, searchWords));
    }

    @Test
    public void 問題2_searchWords側のみにある要素がある() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        ArrayList<String> searchWords = new ArrayList<>();
        searchWords.add("A");
        searchWords.add("B");
        searchWords.add("C");
        assertEquals(2, Station1.q2(list, searchWords));
    }

    @Test
    public void 問題2_互いに存在しない要素がある() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        ArrayList<String> searchWords = new ArrayList<>();
        searchWords.add("B");
        searchWords.add("C");
        assertEquals(1, Station1.q2(list, searchWords));
    }
}
