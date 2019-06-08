import org.junit.Test;

import java.lang.reflect.Array;
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

    @Test
    public void checkOneConstOnePunc() {
        Input item = new Output();
        item.readfromString("That!");
        ArrayList<String> expect = new ArrayList<>();
        expect.add("atThay!");
        assertEquals(expect, item.translateInput());
    }

    @Test
    public void shortSentPuncWithY() {
        Input item = new Output();
        item.readfromString("Don't know why.");
        ArrayList<String> expect = new ArrayList<>();
        expect.add("on'tDay");
        expect.add("owknay");
        expect.add("whyyay.");
        assertEquals(expect, item.translateInput());
    }

    @Test
    public void shortSentPunc() {
        Input item = new Output();
        item.readfromString("Hello world!");
        ArrayList<String> expect = new ArrayList<>();
        expect.add("elloHay");
        expect.add("orldway!");
        assertEquals(expect, item.translateInput());
    }

    @Test
    public void longerStuff() {
        Input item = new Output();
        item.readfromFile("C:\\Users\\hkhan\\Documents\\Proj1\\sillyproj\\src\\Text.txt");
        item.translateInput();
        ((Output) item).printer();
    }
}
