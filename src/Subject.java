import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o){
        observers.add(o);
    }
    public void delete(Observer o){
        observers.remove(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void execute(String mess){
        for (Observer observer: observers){
            observer.update(mess);
        }
    }
}
