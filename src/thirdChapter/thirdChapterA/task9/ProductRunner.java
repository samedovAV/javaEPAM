package thirdChapter.thirdChapterA.task9;

import java.util.ArrayList;

public class ProductRunner {
    public static void main(String[] args) {
        ProductUtils productUtils = new ProductUtils();
        ArrayList<Product> products = productUtils.createProductList();

        productUtils.checkName(products, "Торт");
        System.out.println();
        productUtils.checkLifeTime(products, 6);
        System.out.println();
        productUtils.checkNameAndPrice(products, "Конфеты", 28.5);
    }
}
