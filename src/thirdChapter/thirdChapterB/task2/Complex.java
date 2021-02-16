package thirdChapter.thirdChapterB.task2;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

@Data
@NoArgsConstructor
public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        String im = new DecimalFormat("#0.00").format(this.im);
        String re = new DecimalFormat("#0.00").format(this.re);
        return "Complex{" + "Re=" + re + ", Im=" + im + "}";
    }
}
