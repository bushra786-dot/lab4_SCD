package lab_4_bushra;

public class MainTest {
    public static void main(String[] args) {
        // Create instances of RollNumberThread and DOBThread
        RollNumberThread rollNumberThread = new RollNumberThread();
        DOBThread dobThread = new DOBThread();

        // Start both threads concurrently
        rollNumberThread.start();
        dobThread.start();
        
        // Wait for threads to finish execution (optional)
        try {
            rollNumberThread.join();
            dobThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
