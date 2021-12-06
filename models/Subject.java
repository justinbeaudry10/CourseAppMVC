package models;

import java.util.ArrayList;

// Must be abstract class, NOT interface
public abstract class Subject {
    ArrayList<Observer> observers = new ArrayList();

    public void attach(Observer o) {
        this.observers.add(o);
    }

    public void dettach(Observer o) {
        this.observers.remove(o);
    }

    public void Notify() {
        for (Observer o : observers) {
            o.update();
        }
    }

}
