package exercise1;

import java.util.Random;

public class RandomAdder extends Thread {
    Random rng = new Random();
    int sum = 0;
    @Override
    public void run() {
        while (sum < 1000){
            sum += rng.nextInt(90)+10;
            System.out.println(sum);
        }
    }
}
