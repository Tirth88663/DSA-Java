public class SentenceIsPangram {
    public static void main(String[] args) {
        //1832. Check if the Sentence Is Pangram
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence.contains("c")) {
            return true;
        }
        return false;
    }
}
