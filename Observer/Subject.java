/*
 * Subject, interface for attaching and detaching observers to the client
 */
public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();
}
