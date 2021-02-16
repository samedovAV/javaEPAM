package thirdChapter.thirdChapterC.task16;

import java.util.ArrayList;

public class CharArrayUtils {

    public void checkElement(ArrayList<Character> list, char elem) {
        int amount = 0;
        for (char ch : list) {
            if (ch == elem) {
                amount++;
            }
        }
        //System.out.println("Элемент " + elem + " встречается " + amount + " раз(а)");
    }

    public void crossing(ArrayList<Character> list, ArrayList<Character> listAnother) {
        ArrayList<Character> res = new ArrayList<>();
        for(char ch : list) {
            for(char chh : listAnother) {
                if(ch == chh) {
                    res.add(ch);
                }
            }
        }
        for(char c : res) {
            System.out.print(c + " ");
        }
    }

    public void unite(ArrayList<Character> list, ArrayList<Character> listAnother) {
        ArrayList<Character> res = new ArrayList<>(list);
        res.addAll(listAnother);

        for(char c : res) {
            System.out.print(c + " ");
        }
    }

    public void substr(ArrayList<Character> list, ArrayList<Character> listAnother) {
        ArrayList<Character> res = new ArrayList<>(list);
        for(char ch : list) {
            for(char chh : listAnother) {
                if(ch != chh) {
                    res.add(ch);
                }
            }
        }
    }
}
