package thirdChapter.thirdChapterB.task9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import thirdChapter.thirdChapterB.task6.Point;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle {
    private Point center;
    private double radius;
}


