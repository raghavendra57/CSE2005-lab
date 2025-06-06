public class StartEndCheck {
    public static void main(String[] args) {
        String str = "Hello world!";
        boolean starts = str.startsWith("Hello");
        boolean ends = str.endsWith("!");

        System.out.println("Starts with 'Hello': " + starts);
        System.out.println("Ends with '!': " + ends);
    }
}
