package Aanand_n01712678.Activity_7;

public class FindChar {
    public static void main(String[] args) {
        String str = "Humber";
        char ch = 'r';
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Character '" + ch + "' exists in the string.");
        } else {
            System.out.println("Character '" + ch + "' does not exist in the string.");
        }
    }
}