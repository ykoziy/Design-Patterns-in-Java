/**
 * Concrete strategy implementation
 */
public class SelectionSort implements Strategy {
    @Override
    public int[] sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            swap(i, min, array);
        }
        return array;
    }
}
