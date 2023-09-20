class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread name " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("new Thread :" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " is Exiting.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {

        new NewThread("one");
        new NewThread("Two");
        new NewThread("Three");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("main thread exiting");
    }

}
