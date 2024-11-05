package lab_4_bushra;

public class Main extends Thread {

    // Override the run() method to define the task for the thread
    @Override
    public void run() {
        // Each thread will print "task one"
        System.out.println("task one");
    }

    public static void main(String[] args) {
        // Create three instances of the Main class (each is a separate thread)
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();

        // Print the default name of each thread before starting
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
        System.out.println("Name of t3: " + t3.getName());

        // Start each thread
        t1.start();
        t2.start();
        t3.start();

        // Changing the name of one thread (example: changing name of t1)
        t1.setName("Thread-1");
        System.out.println("After changing name of t1: " + t1.getName());
    }
}
