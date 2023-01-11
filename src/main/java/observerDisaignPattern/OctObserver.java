package observerDisaignPattern;

public class OctObserver extends PersonalObserver {
    public OctObserver(Subject subject){
        this.mozo=subject;
        this.mozo.add(this);

    }

    @Override
    public void update() {
        System.out.println(" "+Integer.toOctalString(mozo.getState()));
    }
}
