package thirdChapter.thirdChapterC.task13;

import java.util.Random;

public class VectorR3Utils {
    public VectorR3 createVector() {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        int z = random.nextInt(10);
        return new VectorR3(x, y, z);
    }

    public void checkOrthogonality(VectorR3 a, VectorR3 b) {
        int scPr = (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ());
        String res = (scPr == 0) ? "Векторы ортогональны" : "Векторы не ортогональны";
        System.out.println(res);
    }


}
