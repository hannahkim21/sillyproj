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
            this.input.add(scan.next());
        }
        scan.close();
        return this.input;
    }

    public ArrayList<String> readfromString(String str) {
        Scanner scan = new Scanner(str);
        while (scan.hasNext()) {
            this.input.add(scan.next());
        }
        scan.close();
        return this.input;
    }
    /*
    * Go through input ArrayList and translate using Pig Latin conventions. Overridden in PigLatin.java.
    */
    public ArrayList<String> translateInput() {
        return this.input;
    }
}
