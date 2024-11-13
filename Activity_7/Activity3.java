package Aanand_n01712678.Activity_7;

public class Activity3 {
    public static void main(String[] args) {

        String s1 = "Welcome";
        System.out.println("\n\t\t\tPART - I");
        System.out.println("Output before any changement : "+s1);
        String s2 = s1.replace('e', 'E');//replacing the e with E
        System.out.println("Output after replacement : "+s2);


        System.out.println("\n\t\t\tPART - II");
        String text = "Welcome to Java and HTML";
        System.out.println("The string is : "+text );
        String[] tokens = text.split(" ");
        s1 = tokens[0];  // "Welcome"
        s2 = tokens[1];  // "to"
        System.out.println("Value reffered by s1 : " + s1);
        System.out.println("Value reffered by s2 : " + s2);
    }
}
