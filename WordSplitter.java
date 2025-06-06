public class WordSplitter {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
