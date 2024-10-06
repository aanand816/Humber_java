package Aanand_n01712678.week2;

    import java.util.Random;
import java.util.Scanner;

    public class test {
        public static void main(String[] args) {

            Scanner scanner =new Scanner(System.in);
            Random random=new Random();
            int userCount = 0, compCount = 0;
            while(userCount < 3 && compCount < 3) {
                System.out.print("Pick one of three options: 0 for scissors, 1 for rock, 2 for paper: ");
                int comp =random.nextInt(3);
                int user=scanner.nextInt();

                if(comp == 0 && user == 1)
                {
                    System.out.println("The computer picked scissors and you picked rock. You won!"	);
                    userCount++;
                }

                else if(comp == 1 && user == 2)
                {
                    System.out.println("The computer picked rock and you picked paper. You won!");
                    userCount++;
                }

                else if(comp == 2 && user == 0)
                {
                    System.out.println("The computer picked paper and you picked scissors. You won!");
                    userCount++;
                }

                else if(comp== 0 && user == 2){
                    System.out.println("The computer chosse scissors and you chose paper. You lost!");
                    compCount++;
                }

                else if(comp == 1 && user == 0)
                {
                    System.out.println("The computer chose rock and you chose scissors. You lost!");
                    compCount++;
                }

                else if(comp == 2 && user == 1)
                {
                    System.out.println("The computer chose paper and you chose rock. You lost!");
                    compCount++;
                }
                else if(user == comp) {
                    System.out.println("You picked the same as the computer. It's a draw!");
                }
                else if (user > 2){
                    System.out.println("Error. Enter one of the three options and try again.");
                }
            }
        }
    }
