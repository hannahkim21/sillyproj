import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Input item = new Output();
        item.readInput();
        item.translateInput();
        ((Output) item).printer();
    }
}
