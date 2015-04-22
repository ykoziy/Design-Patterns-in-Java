import java.util.Arrays;
public class StrategyDriver {
    public static void main(String[] args) { 
        int[] array1 = {54,26,93,17,77,31,44,55,20};
        int[] array2 = {54,26,93,17,77,31,44,55,20};
        int[] array3 = {54,26,93,17,77,31,44,55,20};
        //17, 20, 26, 31, 44, 54, 55, 77, 93
        
        Context context = new Context(new BubbleSort());
        System.out.println(Arrays.toString(context.executeStrategy(array1)));
        
        context = new Context(new SelectionSort());
        System.out.println(Arrays.toString(context.executeStrategy(array2)));

        context = new Context(new InsertionSort());
        System.out.println(Arrays.toString(context.executeStrategy(array3)));
    }
}
