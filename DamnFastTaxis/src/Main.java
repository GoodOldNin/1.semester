public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long executionTime = (endTime - startTime)/ 1000; // in seconds
        System.out.println( "Elapsed milliseconds: " + executionTime );


    }
}

