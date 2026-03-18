import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
void main() {
    FileInputStream f = null;
    String m=new String();
    String n=new String();
    try {
        f = new FileInputStream("in.txt");
    } catch (FileNotFoundException ex)
    { ex.printStackTrace();
    }
    Scanner sc = new Scanner(f);
    while(sc.hasNext())
        m=m.concat(sc.nextLine()).concat("\n");
    sc.close();
    System.out.println(m);
    String[] words = m.split("\\.");
    for(String w: words) {
        n=n.concat(w).concat("\n");
    }
    System.out.println(n);


}
