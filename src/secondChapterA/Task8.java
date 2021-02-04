package secondChapterA;

import java.util.ArrayList;

public class Task8 {
    /**
     * Выводит на консоль палиндромы (если больше одного - второй по счету)
     * @param list исходный массив
     */
    public void showPalindromes(ArrayList<Integer> list) {
        ArrayList<Integer> palindromes = new ArrayList<>();
        for (int num : list) {
            if (isPalindrome(num)) {
                palindromes.add(num);
            }
        }
        if (palindromes.size() == 1) {
            System.out.println("Палиндром: " + palindromes.get(0));
        }
        else if (palindromes.size() > 1) {
            System.out.println("Палиндром: " + palindromes.get(1));
        }
    }

    public static boolean isPalindrome(Integer x) {
        String s = x.toString();
        int len = s.length();
        for (int i = 0; i<len; i+=2) {
            if (s.charAt(i) != s.charAt(len-i-1)) return false;
        }
        return true;
    }
}
