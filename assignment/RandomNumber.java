import java.util.Random;

public class RandomNumber {
   
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(101);
        System.out.println("A random number from 0 to 100 is: " + randomNum);
    }

}
