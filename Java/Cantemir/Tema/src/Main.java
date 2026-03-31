public class Student{

    private
    int numarMatricol;
    String prenume,nume,formatieDeStudiu;
    Double nota;
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
        this.nota=0.0;
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

    public void setNota(Double nota) { this.nota = nota; }


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


void main() {
    HashMap<Integer, Student> studenti = new HashMap<>();
    FileInputStream f = null;
    try {
        f = new FileInputStream("studenti_in.txt");
    } catch (FileNotFoundException ex)
    { ex.printStackTrace();
    }
    Scanner sc = new Scanner(f);
    sc.useDelimiter(",|\\r?\\n");
    while(sc.hasNext())
    {
        int nr=sc.nextInt();
        studenti.put(nr,(new Student(nr,sc.next(),sc.next(),sc.next())));
    }
    sc.close();

    try {
        f = new FileInputStream("note_anon.txt");
    } catch (FileNotFoundException ex)
    { ex.printStackTrace();
    }
    sc = new Scanner(f);
    sc.useDelimiter(",|\\r?\\n");
    while(sc.hasNext())
    {
        int nr=sc.nextInt();
        Double nota=sc.nextDouble();
        Student s = studenti.get(nr);
        if (s != null) {
            s.setNota(nota);
        }
    }
    for (Student s : studenti.values()) {
        System.out.println(s);
    }

}
