package thirdChapter.thirdChapterA.task7;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneUtils {

    public ArrayList<Phone> createPhoneArray() {
        ArrayList<Phone> res = new ArrayList<>();
        res.add(new Phone(0,"Иван","Иванович","Иванов","Сумская 14",14563275,120,110,142,12));
        res.add(new Phone(1,"Богдан","Иванович","Семенов","Сумская 14",48321567,230,170,26,38));
        res.add(new Phone(2,"Антон","Иванович","Петров","Сумская 14",853249,0,10,321,0));
        res.add(new Phone(3,"Богдан","Иванович","Петров","Сумская 14",4558456,0,100,253,10));
        res.add(new Phone(4,"Антон","Иванович","Петров","Сумская 14",4213568,0,70,561,0));
        return res;
    }

    public void checkLocalCalls(ArrayList<Phone> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите время в минутах: ");
        int timeInMins = sc.nextInt();
        for(Phone phone : list) {
            if(phone.getLocalCallsTime() > timeInMins) {
                System.out.println(phone.toString());
            }
        }
    }

    public void checkDistanceCalls(ArrayList<Phone> list) {
        for(Phone phone : list) {
            if(phone.getDistanceCallsTime() > 0) {
                System.out.println(phone.toString());
            }
        }
    }

    public void sortCustomersInAlphabeticalOrder(ArrayList<Phone> list) {
        list.sort(Phone.phoneComparator);
        for (Phone phone : list) {
            System.out.println(phone.toString());
        }
    }
}
