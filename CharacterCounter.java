 public class CharacterCounter {
    public static void main(String[] args) {
        String str = "Hello123@World!";
        int vowels = 0, consonants = 0, digits = 0, special = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digits++;
            } else if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            } else {
                special++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}
 
