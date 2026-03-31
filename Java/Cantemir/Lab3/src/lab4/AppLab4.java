package lab4;

import java.util.HashMap;
import java.util.Map;
class Tanar{
    private String name;
    private int age;
    private String address;

    Tanar(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Tanar{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
public class AppLab4 {

    static void main() {

        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");

        System.out.println(varste);
        varste.put("Vlad",19);
        varste.put("Iulia",19);
        System.out.println(varste);
        System.out.println(adrese);
        HashMap<String, Tanar> tineri=new HashMap<>();
        for (String s : varste.keySet())
        {
            int m=varste.get(s);
            String ad=adrese.get(s);
            tineri.put(s,new Tanar(s,m,ad));
        }

        System.out.println();

        System.out.println(tineri);
    }
}
