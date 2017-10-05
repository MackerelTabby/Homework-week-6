import java.util.InputMismatchException;
import java.util.Scanner;

public class LotteryGame {

    public static int Lotto(int userInput, int userInput2)
    {
            return userInput & userInput2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean restart = true;
        //Array Integers
        int[] Lottery;
        do
        {
        //Random integers
        int shuffle = (int)(Math.random() * 999999999);
        int shuffle2 = (int)(Math.random() * 999999999);

        Lottery = new int[2];

        Lottery[0] = shuffle + shuffle2;
        Lottery[1] = shuffle + shuffle2;
            int userInput;
            int userInput2;
            try {


                System.out.print("Enter the first ten numbers: ");
                userInput = input.nextInt();

                    System.out.print("Enter another set of ten numbers: ");
                    userInput2 = input.nextInt();


                    System.out.println();
                    System.out.println("- Winning Lottery Numbers -");
                    System.out.println("The numbers are: " + shuffle + " " + shuffle2);
                    System.out.println();
                    System.out.println("- User Input -");
                    System.out.println("Your numbers are: " + userInput + " " + userInput2);
                    System.out.println();

                if(shuffle == userInput && shuffle2 == userInput2)
                {
                    System.out.println("Congratulations! You're the winner of the grand prize!");
                    System.out.println("Play again? y/n");
                }
                else
                    System.out.println("Better luck next time.\n");
                restart = true;

        }
            catch(InputMismatchException i)
            {
                input.nextLine();
                System.out.printf("//ERROR// Please enter a number between 0 - 999999999: ");
                System.err.printf("%nException: %s%n ", i);
            }
    }while(restart);
}
}
