package student;

public class Student {

    private int numarMatricol;
    private String prenume, nume, formatieDeStudiu;
    private Float nota = 1.0f;

    public Student() {
        numarMatricol = 0;
        prenume = "Nespecificat";
        nume = "Nespecificat";
        formatieDeStudiu = "Nespecificat";
    }

    public Student(int nr, String pre, String num, String form) {
        numarMatricol = nr;
        prenume = pre;
        nume = num;
        formatieDeStudiu = form;
        nota = 0f;
    }

    public int getNumarMatricol() {
        return numarMatricol;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Student " +
                "Nr. Matricol: " + numarMatricol +
                ", Nume: " + nume +
                ", Prenume: " + prenume +
                ", Formatie: " + formatieDeStudiu +
                ", Nota: " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numarMatricol == student.numarMatricol;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numarMatricol);
    }
}