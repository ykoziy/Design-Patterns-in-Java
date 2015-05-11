/*
 * Memento stores internal state of the Originator object
 */
public class Memento {
    private String time;
    
    public Memento(String timeSave) {
        time = timeSave;
    }
    
    public String getSavedTime() {
        return time;
    }
}
