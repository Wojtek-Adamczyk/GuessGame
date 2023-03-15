import java.util.Random;
import java.util.Scanner;

public class Game
{
    Player player2 = new Player();
    Player player3 = new Player();
    Player player;
    Scanner input = new Scanner(System.in);

    public void play()
    {
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;

        boolean isHit1 = false;
        boolean isHit2 = false;
        boolean isHit3 = false;

        Random rnd = new Random();
        int thisNumber = rnd.nextInt(1,10);

        while (true)
        {
            System.out.println("Pick a number (1-9)");
            player2.generateRandomNumber();
            player3.generateRandomNumber();

            guess1 = input.nextInt();
            guess2 = player2.randomNumber;
            System.out.println("Player 2 picked " + player2.randomNumber);
            guess3 = player3.randomNumber;
            System.out.println("Player 3 picked " + player3.randomNumber);

            if (guess1 == thisNumber)
                isHit1 = true;
            if (guess2 == thisNumber)
                isHit2 = true;
            if (guess3 == thisNumber)
                isHit3 = true;

            if (isHit1 || isHit2 || isHit3)
            {
                System.out.println("We got a winner!");
                if (isHit1)
                    System.out.println("You won!");
                if (isHit2)
                    System.out.println("Player 2 won");
                if (isHit3)
                    System.out.println("Player 3 won");
                break;
            }
            else System.out.println("No one won :(");
        }
    }
}
