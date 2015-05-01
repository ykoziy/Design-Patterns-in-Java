public class HtmlDocument extends DocumentParser {
    @Override
    void processData() {
        System.out.println("HTML: Processing through file.");
    }
    
    @Override
    void writeData() {
        System.out.println("HTML file output.");
    }
}
