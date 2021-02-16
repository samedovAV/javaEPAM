package thirdChapter.thirdChapterA.task7;

import java.util.ArrayList;

public class PhoneRunner {
    /**
     * Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
     * Дебет, Кредит, Время городских и междугородных разговоров.
     * Создать массив объектов. Вывести:
     * a) сведения об абонентах, у которых время внутригородских разговоров
     * превышает заданное;
     * b) сведения об абонентах, которые пользовались междугородной связью;
     * c) сведения об абонентах в алфавитном порядке.
    */
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
