package example2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main boi: " + Thread.currentThread().getName());
        Multi3 multi3 = new Multi3();
        Thread thread = new Thread(multi3, "Multi3");
        thread.start();
        //thread.run(); //dis bad, iškvies paprastą klasės metodą, ne thread'inį.
    }
}

class Multi3 implements Runnable {
    @Override
    public void run(){
        System.out.println("O hai Mark: " + Thread.currentThread().getName());
    }
}