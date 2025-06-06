public class OccurrenceFinder {
    public static void main(String[] args) {
        String str = "programming";
        char ch = 'g';

        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);

        System.out.println("First occurrence of '" + ch + "' is at index: " + first);
        System.out.println("Last occurrence of '" + ch + "' is at index: " + last);
    }
}
