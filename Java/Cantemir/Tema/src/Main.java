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
        prenume=pre; //test
        nume=num;
        formatieDeStudiu=form;
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
    list.add(new Student(423, "Dumitru", "Vasile", "C22/1"));
    list.add(new Student(284, "Amir", "Tanasa", "T21/2"));
    list.add(new Student(130, "Ion", "Ionescu", "TI21/1"));
    Set set = new HashSet();
    set.addAll(list);

    System.out.println("Lista studenti:");
    for (Student s : list) {
        System.out.println(s);
    }


    System.out.println(set.contains(new Student(284, "Amir", "Tanasa", "T21/2")));
    System.out.println(set.contains(new Student(120, "Ion", "Ionescu", "TI21/1")));

}
