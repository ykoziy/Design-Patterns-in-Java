/**
 * Concrete strategy implementation
 */
public class InsertionSort implements Strategy {
    @Override
    public int[] sort(int[] array) {
        int inner, toInsert;
        
        for(int outer = 1; outer < array.length; outer++) {
            inner = outer;
            toInsert = array[outer];
            while((inner > 0) && (array[inner - 1] > toInsert)) {
                array[inner] = array[inner-1];
                inner--;
            }
            array[inner] = toInsert;
        }
        return array;
    }
}
