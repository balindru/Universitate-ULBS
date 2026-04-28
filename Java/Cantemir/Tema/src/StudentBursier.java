package student;

import java.util.Objects;

public class StudentBursier extends Student {

    private double cuantumBursa;

    public StudentBursier(int nr, String pre, String num, String form, double nota, double bursa) {
        super(nr, pre, num, form);
        this.cuantumBursa = bursa;
    }

    public double getCuantumBursa() {
        return cuantumBursa;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" [Bursa: %.2f]", cuantumBursa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentBursier)) return false;
        if (!super.equals(o)) return false;
        StudentBursier that = (StudentBursier) o;
        return Double.compare(that.cuantumBursa, cuantumBursa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }
}