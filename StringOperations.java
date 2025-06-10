package week6;

public class StringOperations {
    
    // Hide last 4 digits of a phone number
    static String hidePhone(String phone) {
        if (phone.length() <= 4) return "****";
        return phone.substring(0, phone.length() - 4) + "****";
    }

    // Hide middle part of an email
    static String hideEmail(String email) {
        int atPos = email.indexOf('@');
        if (atPos <= 2) return "***" + email.substring(atPos); 
        return email.charAt(0) + "***" + email.charAt(atPos - 1) + email.substring(atPos);
    }

    // Replace all characters except first and last
    static String maskMiddle(String word) {
        if (word.length() <= 2) return word;
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(0));
        for (int i = 1; i < word.length() - 1; i++) {
            sb.append("*");
        }
        sb.append(word.charAt(word.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hidden Phone: " + hidePhone("9876543210"));
        System.out.println("Hidden Email: " + hideEmail("example123@gmail.com"));
        System.out.println("Masked Name: " + maskMiddle("Nikhil"));
    }
}

