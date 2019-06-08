import org.apache.commons.logging.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


class Input {
    ArrayList<String> input = new ArrayList();
    /*
    * Take in standard input and write to an ArrayList.
    */

    public void readInput() {
        System.out.print("Enter text here: ");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            this.input.add(scan.next());
        }
        scan.close();
    }

    public void readfromString(String str) {
        Scanner scan = new Scanner(str);
        while (scan.hasNext()) {
            this.input.add(scan.next());
        }
        scan.close();
    }

    public void readfromFile(String filename){
        try {
            File file = new File(filename);
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                this.input.add(scan.next());
            }
            scan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Invalid file name");
        }
    }
    /*
    * Go through input ArrayList and translate using Pig Latin conventions. Overridden in PigLatin.java.
    */
    public ArrayList<String> translateInput() {
        return this.input;
    }
}
