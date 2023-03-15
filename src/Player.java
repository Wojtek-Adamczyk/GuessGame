import java.util.Random;

public class Player
{
    int randomNumber = 0;

    void generateRandomNumber()
    {
        Random rnd = new Random();
        randomNumber = rnd.nextInt(1,10);
    }
}
