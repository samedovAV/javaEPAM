package thirdChapter.thirdChapterA.task7;

import java.util.ArrayList;

public class PhoneRunner {
    public static void main(String[] args) {

        PhoneUtils phoneUtils = new PhoneUtils();
        ArrayList<Phone> phones = phoneUtils.createPhoneArray();


        phoneUtils.checkLocalCalls(phones);
        System.out.println();
        phoneUtils.checkDistanceCalls(phones);
        System.out.println();
        phoneUtils.sortCustomersInAlphabeticalOrder(phones);
    }
}
