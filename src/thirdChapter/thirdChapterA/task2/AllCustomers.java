package thirdChapter.thirdChapterA.task2;

import java.util.ArrayList;

public class AllCustomers {
    /**
     * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
     * Номер банковского счета.
     * Создать массив объектов. Вывести:
     * a) список покупателей в алфавитном порядке;
     * b) список покупателей, у которых номер кредитной карточки находится
     * в заданном интервале.
    */
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList();

        ArrayList<Customer> customers = customerList.createArray();

        customerList.sortCustomersInAlphabeticalOrder(customers);
        System.out.print("\n");
        customerList.checkCreditCardNumber(customers, 3600, 4600);
    }
}
