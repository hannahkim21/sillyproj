import java.util.ArrayList;
import java.lang.String;

public class PigLatin extends Input {
    ArrayList<String> translatedArray = new ArrayList<>();
    /*
     * Go through ArrayList and translate each word by applying the rules of Pig Latin, returning an ArrayList.
     */
    @Override
    public ArrayList<String> translateInput() {
        for (String word : this.input) {
            //Pig Latin Rule #1: Does the word begin with a vowel or consonant
            char first = word.charAt(0);
            //My Rule #1: I care about ending punctuation. I assume the input has correct punctuation.
            String punc = "";
            int end = word.length() - 1;
                while (end >= 0) {
                    if (word.charAt(end)=='!' || word.charAt(end)=='.' || word.charAt(end)=='?') {
                        punc = word.charAt(end) + punc;
                    }
                    end--;
                }
            if (first=='a' || first=='A' || first=='e' || first=='E' || first=='i' ||
                    first=='I' || first=='o' || first=='O' || first=='u' || first=='U') {
                StringBuilder newWord = new StringBuilder(word.length()+3);
                if (punc!="") {
                    int lenpunc = punc.length();
                    int puncstart = word.length() - lenpunc;
                    newWord.append(word.substring(0,puncstart));
                    newWord.append("yay");
                    newWord.append(word.substring(puncstart));
                    translatedArray.add(newWord.toString());
                } else {
                    newWord.append(word);
                    newWord.append("yay");
                    translatedArray.add(newWord.toString());
                }
            }
            else {
                //Pig Latin Rule #2: For consonants, chunk the contiguous consonants
                StringBuilder chunk = new StringBuilder(word.length());
                int index = 0;
                while (index < word.length()) {
                    if (word.charAt(index)!='a' && word.charAt(index)!='A' && word.charAt(index)!='e' &&
                            word.charAt(index)!='E' && word.charAt(index)!='i' && word.charAt(index)!='I' &&
                            word.charAt(index)!='o' && word.charAt(index)!='O' && word.charAt(index)!='u' &&
                            word.charAt(index)!='U') {
                        chunk.append(word.charAt(index));
                        index += 1;
                    }
                    else {
                        break;
                    }
                }
                //Pig Latin Rule #3: If y is the last character in the chunk, treat it as a vowel and ignore
                int puncstart = word.length() - punc.length();
                String newWord = word.substring(index, puncstart);
                newWord += chunk.toString();
                newWord += "ay";
                newWord += punc;
                translatedArray.add(newWord);
            }
        }
        return translatedArray;
    }
}
