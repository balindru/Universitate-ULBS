package student;

public class StudentBursieri extends Student {

    private double cuantumBursa;

    public StudentBursieri(int nr, String pre, String num, String form, double bursa) {
        super(nr, pre, num, form);
        this.cuantumBursa = bursa;
    }

    public double getCuantumBursa() {
        return cuantumBursa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bursa: " + cuantumBursa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentBursieri sb = (StudentBursieri) o;
        return Double.compare(cuantumBursa, sb.cuantumBursa) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(cuantumBursa);
    }
}