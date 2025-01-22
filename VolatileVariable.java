package wiprotraining;

public class VolatileVariable {

	    // Without volatile: changes to this variable might not be visible across threads
	    private static boolean flag = false;

	    // With volatile: ensures the flag is visible across threads
	    private static volatile boolean volatileFlag = false;

	    public static void main(String[] args) throws InterruptedException {
	        // Thread 1: Modify the flag variable
	        Thread thread1 = new Thread(() -> {
	            try {
	                Thread.sleep(1000); // Simulate some processing time
	                flag = true; // Without volatile, thread 2 might not see this change
	                System.out.println("Thread 1: flag is set to true");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        // Thread 2: Check the flag variable
	        Thread thread2 = new Thread(() -> {
	            while (!flag) { // Without volatile, this thread might never exit
	                // busy-waiting until flag is true
	            }
	            System.out.println("Thread 2: flag is true, exiting loop.");
	        });

	        // Start threads without volatile flag
	        thread1.start();
	        thread2.start();

	        // Wait for threads to finish
	        thread1.join();
	        thread2.join();

	        // Demonstrating the effect with the volatile keyword
	        // Thread 3: Modify the volatileFlag variable
	        Thread thread3 = new Thread(() -> {
	            try {
	                Thread.sleep(1000); // Simulate some processing time
	                volatileFlag = true; // With volatile, thread 4 will immediately see this change
	                System.out.println("Thread 3: volatileFlag is set to true");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        // Thread 4: Check the volatileFlag variable
	        Thread thread4 = new Thread(() -> {
	            while (!volatileFlag) { // With volatile, this loop will exit immediately when volatileFlag becomes true
	            }
	            System.out.println("Thread 4: volatileFlag is true, exiting loop.");
	        });

	        // Start threads with volatile flag
	        thread3.start();
	        thread4.start();

	        // Wait for threads to finish
	        thread3.join();
	        thread4.join();
	    }
	}

