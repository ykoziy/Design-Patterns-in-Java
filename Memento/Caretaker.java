import java.util.ArrayList;

/*
 * Caretaker responsible for keeping the memento
 */
public class Caretaker {
    ArrayList<Memento>  mementoList = new ArrayList<>();
    
    public void addMemento(Memento m) {
        mementoList.add(m);
    }
    
    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
