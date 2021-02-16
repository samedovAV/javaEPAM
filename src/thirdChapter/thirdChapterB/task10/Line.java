package thirdChapter.thirdChapterB.task10;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Line {

    private double a;
    private double b;
    private double c;

    public String getInsertionPointWithX() {
        double xCoord = -(this.c) / this.a;
        return "Точка перечения с осью OX: " + "(" + Math.round(xCoord * 100.0) / 100.0 + ";" + 0 + ")";
    }

    public String getInsertionPointWithY() {
        double yCoord = -(this.c) / this.b;
        return "Точка перечения с осью OY: " + "(" + 0 + ";" + Math.round(yCoord * 100.0) / 100.0 + ")";
    }
}
