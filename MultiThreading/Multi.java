

class MultiThread extends Thread {
    public void run() {
        System.out.println("Running Thread Name: " + this.currentThread().getName());
        System.out.println("Running Thread Priority: " + this.currentThread().getPriority());
    }
}

class Multi {
    public static void main(String[] args) {
        MultiThread m1 = new MultiThread();
        m1.setName("Thread 1");
        m1.setPriority(Thread.MIN_PRIORITY);

        MultiThread m2 = new MultiThread();
        m2.setName("Thread 2");
        m2.setPriority(Thread.MAX_PRIORITY);

        MultiThread m3 = new MultiThread();
        m3.setName("Thread 3");

        m1.start();
        m2.start();
        m3.start();
    }
}