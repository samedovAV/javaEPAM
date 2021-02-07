package thirdChapter.thirdChapterA.task2;

import java.util.ArrayList;

public class CustomerList {
    private final ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void sortCustomersInAlphabeticalOrder() {
        customers.sort(Customer.surnameComparator);
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void checkCreditCardNumber(int a, int b) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= a && customer.getCreditCardNumber() <= b) {
                System.out.println(customer.toString());
            }
        }
    }


}
