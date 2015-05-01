public class XmlDocument extends DocumentParser {
    @Override
    void processData() {
        System.out.println("XML: Processing through file.");
    }
    
    @Override
    void writeData() {
        System.out.println("XML file output.");
    }
}
