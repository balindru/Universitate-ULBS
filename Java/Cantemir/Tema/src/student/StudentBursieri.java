package student;


public class StudentBursieri extends Student {

    double cuantumBursa;

    public StudentBursieri(int nr, String pre, String num, String form, double bursa) {
        super(nr, pre, num, form);
        setNota(2.0f);
        cuantumBursa = bursa;

    }
    public void setNota(Float nota) {
        super.setNota(nota);
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
