public class MainClass {
    private DataClass data;
    
    public MainClass(int a, int b, int c) {
        data = new DataClass(a, b ,c);
    }
    
    public int sum() {
        return data.getNum1() + data.getNum2() + data.getNum3();
    }
}
