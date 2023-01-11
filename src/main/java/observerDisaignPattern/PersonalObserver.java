package observerDisaignPattern;

import org.apache.commons.io.input.ObservableInputStream;

public abstract class PersonalObserver extends ObservableInputStream.Observer {
    protected Subject mozo;
    public abstract void update();
}
