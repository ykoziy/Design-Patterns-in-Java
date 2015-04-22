/**
 * Strategy interface
 */
public interface Strategy {
    int[] sort(int[] array);
    
    //sorting helper function, works with Java 8
    default void swap(int a, int b, int[] array) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
