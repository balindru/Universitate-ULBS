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
    Student s= new Student(423,"Dunitru","Vasile","Format");

    System.out.println(s);
}
