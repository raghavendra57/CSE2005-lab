public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        if (str1.equalsIgnoreCase(str2))
            System.out.println("Strings are equal (case ignored)");
        else
            System.out.println("Strings are not equal");
    }
}

