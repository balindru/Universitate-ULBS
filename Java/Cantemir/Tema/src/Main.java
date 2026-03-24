import java.util.ArrayList;
import java.util.HashSet;

public class Student{

    private
    int NumarMatricol;
    String prenume,nume,formatieDeStudiu;
    Student()
    {
        NumarMatricol=0;
        prenume="Nespecificat";
        nume="Nespecificat";
        formatieDeStudiu="Nespecificat";
    }
    Student(int nr, String pre,String num,String form)
    {
        NumarMatricol=nr;
        prenume=pre;
        nume=num;
        formatieDeStudiu=form;
    }

    public int getNumarMatricol() {
        return NumarMatricol;
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


    public String toString() {
        return "Student " +
                "Nr. Matricol: " + NumarMatricol +
                ", Nume: " + nume +
                ", Prenume: " + prenume +
                ", Formatie: " + formatieDeStudiu;
    }


    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return prenume.equals(s.prenume) &&
                nume.equals(s.nume) &&
                formatieDeStudiu.equals(s.formatieDeStudiu);
    }

    @Override
    public int hashCode() {
        return (prenume + nume + formatieDeStudiu).hashCode();
    }

}


void main() {
    ArrayList<Student> list = new ArrayList<>();
    ArrayList<Student> list2 = new ArrayList<>();
    FileInputStream f = null;
    try {
        f = new FileInputStream("studenti_in.txt");
    } catch (FileNotFoundException ex)
    { ex.printStackTrace();
    }
    Scanner sc = new Scanner(f);
    sc.useDelimiter(",|\\n");
    while(sc.hasNext())
    {
        list.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.next()));
    }
    sc.close();
    list2=list;

    for (Student s : list) {
        System.out.println(s);
    }

    System.out.println();
    list.sort(Comparator.comparing(Student::getNume));

    for (Student s : list) {
        System.out.println(s);
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("studenti_out.txt"))) {
        for (Student s : list) {
            bw.write(s.getNumarMatricol() + "," +
                    s.getPrenume() + "," +
                    s.getNume() + "," +
                    s.getFormatieDeStudiu());
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    list.sort(Comparator.comparing(Student::getFormatieDeStudiu).thenComparing(Student::getNume));

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("studenti_out_sorted.txt"))) {
        for (Student s : list2) {
            bw.write(s.getNumarMatricol() + "," +
                    s.getPrenume() + "," +
                    s.getNume() + "," +
                    s.getFormatieDeStudiu());
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println();
    for (Student s : list2) {
        System.out.println(s);
    }
}
