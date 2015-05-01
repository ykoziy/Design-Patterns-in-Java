public abstract class DocumentParser {
    public void readAndGenerate() {
        readData();
        processData();
        writeData();
    }
    
    abstract void processData();
    abstract void writeData();
        
    public void readData() {
        System.out.println("Data is read.");
    }
}
