import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


class Input {
    ArrayList<String> input = new ArrayList();
    /*
    * Take in standard input and write to an ArrayList.
    */
    public ArrayList<String> readInput() {
        System.out.print("Enter text here: ");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            input.add(scan.next());
        }
        scan.close();
        return input;
    }
    /*
    * Go through input ArrayList and translate using Pig Latin conventions. Overridden in PigLatin.java.
    */
    public ArrayList<String> translateInput() {
        return this.input;
    }
}
