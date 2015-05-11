/*
 * Originator is an object for which the state is saved, 
 * creates and uses memento for future undo operations
 */
public class Originator {
    private String time;
    
    public void setTime(String newTime) {
        time = newTime;
    }
    
    public String getTime() {
        return time;
    }
    
    public Memento saveToMemento() {
        return new Memento(time);
    }
    
    public void restoreFromMemento(Memento memento) {
        time = memento.getSavedTime();
    }
    
}
