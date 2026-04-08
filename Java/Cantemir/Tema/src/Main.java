import student.Student;
import student.StudentBursieri;

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

    List<Student> bursieri = new ArrayList<>();
    bursieri.add(new StudentBursieri(1025, "Andrei",   "Popa",     "ISM141/2", 725.50));
    bursieri.add(new StudentBursieri(1024, "Ioan",     "Mihalcea", "ISM141/1", 801.10));
    bursieri.add(new StudentBursieri(1026, "Anamaria", "Prodan",   "TI131/1",  745.50));
    bursieri.add(new StudentBursieri(1029, "Bianca",   "Popescu",  "TI131/1",  780.80));
    salveazaInFisier("bursieri_out.txt", bursieri);
    for (Student s: bursieri)
    {
        System.out.println(s);
    }
    for (int i=0;i<bursieri.size();i++)
    {
        System.out.println(bursieri.get(i));
    }
    bursieri.forEach(System.out::println);
    bursieri.forEach((Object o)-> System.out.println(o)    );



}
