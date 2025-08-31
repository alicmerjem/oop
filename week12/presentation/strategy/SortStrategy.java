package week12.presentation.strategy;

public interface SortStrategy {
    void sort(int[] arr);
} 

class BubbleSortStrategy implements SortStrategy {
    public void sort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSortStrategy implements SortStrategy {
    public void sort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        } 
    }
}

class Sorter {
    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] arr) {
        strategy.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}

class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};

        Sorter sorter1 = new Sorter(new BubbleSortStrategy());
        sorter1.sortArray(numbers.clone()); // [1, 2, 3, 5, 9]

        Sorter sorter2 = new Sorter(new SelectionSortStrategy());
        sorter2.sortArray(numbers.clone()); // [1, 2, 3, 5, 9]
    }
}