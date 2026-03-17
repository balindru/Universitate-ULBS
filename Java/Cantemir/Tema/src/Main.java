import java.util.ArrayList;

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
}


void main() {
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student(423, "Dumitru", "Vasile", "C22/1"));
    list.add(new Student(284, "Alis", "Popa", "TI21/2"));
    list.add(new Student(130, "Ion", "Ionescu", "TI21/1"));

    System.out.println("Lista studenti:");
    for (Student s : list) {
        System.out.println(s);
    }


}
