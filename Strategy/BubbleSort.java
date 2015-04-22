/**
 * Concrete strategy implementation
 */
public class BubbleSort implements Strategy {
    @Override
    public int[] sort(int[] array) {
        for(int i = array.length - 1; i > 1; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    swap(j, j+1, array);
                }
            }
        }
        return array;
    }
}
