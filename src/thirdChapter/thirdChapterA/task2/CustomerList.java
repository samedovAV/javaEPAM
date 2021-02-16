package thirdChapter.thirdChapterA.task2;

import java.util.ArrayList;

public class CustomerList {

    public ArrayList<Customer> createArray() {
        ArrayList<Customer> res = new ArrayList<>();
        res.add(new Customer(1,"Богдан","Семенчуков","Иванович","Озерная 5",1423,14562148));
        res.add(new Customer(2,"Иван","Гагарин","Николаевич","Озерная 5",3612,4236568));
        res.add(new Customer(3,"Антон","Толстой","Иванович","Озерная 5",4578,1863848));
        return res;
    }

    public void sortCustomersInAlphabeticalOrder(ArrayList<Customer> customers) {
        customers.sort(Customer.surnameComparator);
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void checkCreditCardNumber(ArrayList<Customer> customers, int a, int b) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= a && customer.getCreditCardNumber() <= b) {
                System.out.println(customer.toString());
            }
        }
    }


}
