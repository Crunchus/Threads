package example1;

public class Main {
    public static void main(String[] args) {
        Multi multi = new Multi();
        multi.start();
        System.out.println("Main: " + Thread.currentThread().getName());
    }
}

class Multi extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Labas: " + Thread.currentThread().getName());
    }
}
