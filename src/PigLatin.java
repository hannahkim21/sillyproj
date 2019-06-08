import java.util.ArrayList;
import java.lang.String;

public class PigLatin extends Input {
    /*
     * Go through ArrayList and translate each word by applying the rules of Pig Latin, returning an ArrayList.
     */
    @Override
    public ArrayList<String> translateInput() {
        ArrayList<String> translatedArray = new ArrayList<>();
        for (String word : this.input) {
            //Pig Latin Rule #1: Does the word begin with a vowel or consonant
            char first = word.charAt(0);
            if (first=='a' || first=='A' || first=='e' || first=='E' || first=='i' ||
                    first=='I' || first=='o' || first=='O' || first=='u' || first=='U') {
                StringBuilder newWord = new StringBuilder(word.length()+3);
                newWord.append(word);
                newWord.append("yay");
                word = newWord.toString();
                System.out.println(word);
                translatedArray.add(word);
            }
            else {
                //Pig Latin Rule #2: For consonants, chunk the contiguous consonants
                int index = 0;
                char curr = word.charAt(index);
                while (curr!='a' || curr!='A' || curr!='e' || curr!='E' || curr!='i' ||
                        curr!='I' || curr!='o' || curr!='O' || curr!='u' || curr!='U') {
                    if (index <= word.length()) index += 1;
                    curr = word.charAt(index);
                }

                String chunk = word.substring(0,index);
                String rest = word.substring(index,word.length());
                StringBuilder newWord = new StringBuilder(word.length()+2);
                newWord.append(rest);
                newWord.append(chunk);
                newWord.append("ay");
                word = newWord.toString();
                System.out.println(word);
                translatedArray.add(word);
            }
                for (int ch = 0; ch < word.length(); ch++) {
                    char curr = word.charAt(ch);
                    if ((curr=='a' || curr=='A' || curr=='e' || curr=='E' || curr=='i' ||
                            curr=='I' || curr=='o' || curr=='O' || curr=='u' || curr=='U')) {
                }
            }


        }
        for (int i = 0; i < this.input.size(); i++) {
            String temp = this.input.get(i);
            for (int j = 0; j < temp.length(); j++) {

                //Punctuated at end

                //Not punctuated


                //Vowel

                //Consonant(s)
            }
        }
        return translatedArray;
    }
}
