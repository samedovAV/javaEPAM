package thirdChapter.thirdChapterA.task9;

import java.util.ArrayList;

public class ProductRunner {
    /**
     * Product: id, Наименование, UPC, Производитель, Цена, Срок хранения,
     * Количество.
     * Создать массив объектов. Вывести:
     * a) список товаров для заданного наименования;
     * b) список товаров для заданного наименования, цена которых не превосходит заданную;
     * c) список товаров, срок хранения которых больше заданного.
    */
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
