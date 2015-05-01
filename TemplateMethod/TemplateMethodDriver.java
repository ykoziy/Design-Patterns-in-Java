/*
 * Template Method pattern, defines the skeleton of an algorithm in an operation, deferring some steps to client subclasses. 
 */
public class TemplateMethodDriver {
    public static void main(String[] args) { 
        XmlDocument xml = new XmlDocument();
        xml.readAndGenerate();
        System.out.println("===================================");
        HtmlDocument html = new HtmlDocument();
        html.readAndGenerate();        
    }
}
