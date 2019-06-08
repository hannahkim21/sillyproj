public class Output extends PigLatin {
    public String printer() {
        StringBuilder ret = new StringBuilder();
        for (String word : this.translatedArray) {
            System.out.print(word);
            System.out.print(" ");
            ret.append(word);
            ret.append(" ");
        }
        //Remove one extra space from the end
        return ret.toString().substring(0, ret.toString().length()-1);
    }
}
