public class Student{

    private
    int numarMatricol;
    String prenume,nume,formatieDeStudiu;
    Float nota;
    Student()
    {
        numarMatricol=0;
        prenume="Nespecificat";
        nume="Nespecificat";
        formatieDeStudiu="Nespecificat";
    }
    Student(int nr, String pre,String num,String form)
    {
        numarMatricol=nr;
        prenume=pre;
        nume=num;
        formatieDeStudiu=form;
        this.nota=0f;
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

    public void setNota(Float nota) { this.nota = nota; }


    public String toString() {
        return "Student " +
                "Nr. Matricol: " + numarMatricol +
                ", Nume: " + nume +
                ", Prenume: " + prenume +
                ", Formatie: " + formatieDeStudiu +
                ", Nota: "+ nota;
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

public static float gasesteNota(String prenume, String nume, Map<Integer, Student> tineri) {
    HashMap<String, Student> gaseste = new HashMap<>();
    for (Student s : tineri.values()) {
        String cheie = s.getPrenume() + "-" + s.getNume();
        gaseste.put(cheie, s);
    }
    String cheieCautare = prenume + "-" + nume;
    Student gasit = gaseste.get(cheieCautare);
    if (gasit != null && gasit.getNota() != null) {
        return gasit.getNota().floatValue();
    }
    return 0.0f;
}
class StudentBursieri extends Student
{
    double cuantumBursa;
    StudentBursieri(int nr, String pre,String num,String form, double bursa)
    {
        super(nr, pre, num, form);
        cuantumBursa=bursa;
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
public static void salveazaInFisier(String numeFisier, List<? extends Student> colectie) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(numeFisier))) {
        for (Student s : colectie) {
            bw.write(s.toString());
            bw.newLine();
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

void main() {

    List<StudentBursieri> bursieri = new ArrayList<>();
    bursieri.add(new StudentBursieri(1025, "Andrei",   "Popa",     "ISM141/2", 725.50));
    bursieri.add(new StudentBursieri(1024, "Ioan",     "Mihalcea", "ISM141/1", 801.10));
    bursieri.add(new StudentBursieri(1026, "Anamaria", "Prodan",   "TI131/1",  745.50));
    bursieri.add(new StudentBursieri(1029, "Bianca",   "Popescu",  "TI131/1",  780.80));
    salveazaInFisier("bursieri_out.txt", bursieri);
}
