package thirdChapter.thirdChapterA.task9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;

    private String name;

    private int UPC;

    private String manufacturer;

    private double price;

    private int lifeTime;

    private int number;
}
