public class FinalizeExample {
    // Static member to store the number of objects created
    private static int numberOfObjects = 0;

    // Constructor increments the count of objects
    public FinalizeExample() {
        numberOfObjects++;
    }

    // Finalize method decrements the count of objects
    protected void finalize() {
        System.out.println("Finalizing object " + numberOfObjects);
        numberOfObjects--;
    }

    public static void main(String[] args) {
        // Creating objects
        for (int i = 1; i <= 5; i++) {
            new FinalizeExample();
        }

        // Explicitly invoking garbage collection to trigger finalize methods
        System.gc();

        // Adding a delay to allow time for the garbage collector to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the number of objects after garbage collection
        System.out.println("Number of objects after garbage collection: " + numberOfObjects);
    }
}
