import java.util.ArrayList;
import java.util.Random;

public class FischMain {
    public static void main(String[] args)
            throws InterruptedException {
        Aquarium aq = new Aquarium(400, 400);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {

            aq.addFisch(new Rotfisch(r.nextInt(400), r.nextInt(400)));
            aq.addFisch(new Gelbfisch(r.nextInt(400), r.nextInt(400)));
            aq.addFisch(new Blaufisch(r.nextInt(400), r.nextInt(400)));
            aq.addFisch(new SlowFisch(r.nextInt(400), r.nextInt(400)));
        }


        while (true) {
            aq.bewege();
            aq.zeichne();
            Thread.sleep(30);
        }
    }

}