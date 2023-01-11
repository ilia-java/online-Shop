package observerDisaignPattern;

import org.apache.commons.io.input.ObservableInputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Subject {
    private List<PersonalObserver> observers =new ArrayList<>();
    private int state;
    public void  add(PersonalObserver obs){
        observers.add(obs);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    private void execute(){
        for (PersonalObserver personalObserver:observers){
            personalObserver.update();
        }
    }
}
