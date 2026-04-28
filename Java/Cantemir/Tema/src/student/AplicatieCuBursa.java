package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AplicatieCuBursa {

    public static void main(String[] args) {
        AplicatieCuBursa instanta = new AplicatieCuBursa();

        List<StudentBursieri> lista = instanta.genereaza();
        for (StudentBursieri student : lista) {
            System.out.println(student);
        }

        System.out.println("--------------------------------------------------");

        List<StudentBursieri> sortata = instanta.sorteaza(lista);
        for (StudentBursieri student : sortata) {
            System.out.println(student);
        }
    }

    public List<StudentBursieri> genereaza() {
        List<StudentBursieri> lista = new ArrayList<>();

        StudentBursieri s1 = new StudentBursieri(1025, "Andrei", "Popa", "ISM141/2", 725.50);


        StudentBursieri s2 = new StudentBursieri(1024, "Ioan", "Mihalcea", "ISM141/1", 801.10);


        StudentBursieri s3 = new StudentBursieri(1029, "Bianca", "Popescu", "TI131/1", 780.80);


        StudentBursieri s4 = new StudentBursieri(1026, "Anamaria", "Prodan", "TI131/1", 745.50);


        StudentBursieri s5 = new StudentBursieri(1030, "Bianca", "Popescu", "TI131/1", 100.00);


        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);

        return lista;
    }

    public List<StudentBursieri> sorteaza(List<StudentBursieri> lst) {
        List<StudentBursieri> copie = new ArrayList<>(lst);

        copie.sort(
                Comparator.comparing(StudentBursieri::getFormatieDeStudiu)
                        .thenComparing(StudentBursieri::getNume)
                        .thenComparing(StudentBursieri::getPrenume)
                        .thenComparing(StudentBursieri::getNota)
                        .thenComparingDouble(StudentBursieri::getCuantumBursa)
        );

        return copie;
    }
}