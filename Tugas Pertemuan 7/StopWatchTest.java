import java.util.Random;

class StopWatch {
    private long startTime;
    private long endTime;
    
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    public long duration() {
        return (endTime - startTime)/1000;
    }
}

public class StopWatchTest {
    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(size);
        }
        
        StopWatch stopwatch = new StopWatch();
        
        stopwatch.start();
        
        selectionSort(numbers);
        
        stopwatch.stop();
        
        System.out.println("Waktu eksekusi selection sort: " + stopwatch.duration() + " detik");
    }
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
