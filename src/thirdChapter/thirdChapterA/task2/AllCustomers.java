package thirdChapter.thirdChapterA.task2;

public class AllCustomers {

    public static void main(String[] args) {
        Customer cust1 = new Customer(0,"Богдан","Иванович","Семенчуков","Озерная 5",1423,14562148);
        Customer cust2 = new Customer(1,"Иван","Николаевич","Гагарин","Озерная 5",3612,4236568);
        Customer cust3 = new Customer(2,"Антон","Иванович","Толстой","Озерная 5",4578,1863848);

        CustomerList customerList = new CustomerList();
        customerList.addCustomer(cust1);
        customerList.addCustomer(cust2);
        customerList.addCustomer(cust3);

        customerList.sortCustomersInAlphabeticalOrder();
        System.out.println("\n");
        customerList.checkCreditCardNumber(3600, 4600);
    }
}
