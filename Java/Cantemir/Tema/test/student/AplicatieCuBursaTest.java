package student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AplicatieCuBursaTest {

    AplicatieCuBursa appCuBursa = new AplicatieCuBursa();

    @Test
    void sortTest1() {
        // arrange
        List<StudentBursieri> lista = appCuBursa.genereaza();

        // act
        List<StudentBursieri> sortata = appCuBursa.sorteaza(lista);

        // assert
        Assertions.assertEquals("ISM141/1", sortata.get(0).getFormatieDeStudiu());
        Assertions.assertEquals("Mihalcea", sortata.get(0).getNume());

        Assertions.assertEquals("ISM141/2", sortata.get(1).getFormatieDeStudiu());
        Assertions.assertEquals("Popa", sortata.get(1).getNume());

        Assertions.assertEquals("TI131/1", sortata.get(2).getFormatieDeStudiu());
        Assertions.assertEquals("Popescu", sortata.get(2).getNume());
        Assertions.assertEquals("Bianca", sortata.get(2).getPrenume());
        Assertions.assertEquals(9.10f, sortata.get(2).getNota());
        Assertions.assertEquals(100.00, sortata.get(2).getCuantumBursa());

        Assertions.assertEquals("TI131/1", sortata.get(3).getFormatieDeStudiu());
        Assertions.assertEquals("Popescu", sortata.get(3).getNume());
        Assertions.assertEquals("Bianca", sortata.get(3).getPrenume());
        Assertions.assertEquals(9.10f, sortata.get(3).getNota());
        Assertions.assertEquals(780.80, sortata.get(3).getCuantumBursa());

        Assertions.assertEquals("TI131/1", sortata.get(4).getFormatieDeStudiu());
        Assertions.assertEquals("Prodan", sortata.get(4).getNume());
    }
}