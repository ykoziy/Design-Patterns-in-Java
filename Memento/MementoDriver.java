/*
 * Memento pattern, is used to restore an internal state of an object to a previous state 
 * without violating encapsulation.
 */
public class MementoDriver {
    public static void main(String[] args) { 
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        
        System.out.println("State #1 - 2:15 PM");
        originator.setTime("2:15 PM");
        caretaker.addMemento(originator.saveToMemento());
        
        System.out.println("State #2 - 2:25 PM");
        originator.setTime("2:25 PM");
        caretaker.addMemento(originator.saveToMemento());
        
        System.out.println("State #3 - 2:45 PM");
        originator.setTime("2:45 PM");
        caretaker.addMemento(originator.saveToMemento());
        
        System.out.println("\nPrevious time states are: ");
        
        originator.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Saved state #1: " + originator.getTime());
        
        originator.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Saved state #2: " + originator.getTime());
        
        originator.restoreFromMemento(caretaker.getMemento(2));
        System.out.println("Saved state #3: " + originator.getTime());        
    }
}
