import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class TranslateTest {

    @Test
    public void checkOneConstPunc() {
        Input item = new Output();
        item.readfromString("Hello?!?!?!");
        ArrayList<String> expect = new ArrayList<>();
        expect.add("elloHay?!?!?!");
        assertEquals(expect, item.translateInput());
    }

    @Test
    public void checkMultConstPunc() {
        Input item = new Output();
        item.readfromString("Thought?!?..!");
        ArrayList<String> expect = new ArrayList<>();
        expect.add("oughtThay?!?..!");
        assertEquals(expect, item.translateInput());
    }

}
