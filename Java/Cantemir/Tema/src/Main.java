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
    public int GetNr()
    {
        return NumarMatricol;
    }
    public String GetPrenume()
    {
        return prenume;
    }
    public String GetNume()
    {
        return nume;
    }
    public String GetFormatie()
    {
        return formatieDeStudiu;
    }
}


void main() {
    Student s= new Student(423,"Dunitru","Vasile","Format");

    System.out.println(s.GetNr());
    System.out.println(s.GetNume());
    System.out.println(s.GetPrenume());
    System.out.println(s.GetFormatie());
}
