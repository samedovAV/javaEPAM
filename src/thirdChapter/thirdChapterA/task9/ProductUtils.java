package thirdChapter.thirdChapterA.task9;

import java.util.ArrayList;

public class ProductUtils {

    public ArrayList<Product> createProductList() {
        ArrayList<Product> res = new ArrayList<>();
        res.add(new Product(0,"Торт",1275,"Рошен",143.75,5,6));
        res.add(new Product(1,"Торт",1276,"Рошен",212.50,5,2));
        res.add(new Product(2,"Чай",2437,"Индия",38.45,120,32));
        res.add(new Product(3,"Конфеты",2437,"Конти",29.5,60,86));
        return res;
    }

    public void checkName(ArrayList<Product> list, String name) {
        for (Product product : list) {
            if (name.equals(product.getName())) {
                System.out.println(product.toString());
            }
        }
    }

    public void checkNameAndPrice(ArrayList<Product> list, String name, double price) {
        for (Product product : list) {
            if (name.equals(product.getName()) && product.getPrice() <= price) {
                System.out.println(product.toString());
            }
        }
    }

    public void checkLifeTime(ArrayList<Product> list, int lifeTime) {
        for (Product product : list) {
            if (product.getLifeTime() > lifeTime) {
                System.out.println(product.toString());
            }
        }
    }

}
