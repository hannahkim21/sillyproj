public class Output extends PigLatin {
    public void printer() {
        for (String word : this.translatedArray) {
            System.out.print(word);
            System.out.print(" ");
        }
    }
}
