package observerDisaignPattern;

public class HexObserver extends PersonalObserver{
    public HexObserver(Subject subject){
        this.mozo=subject;
        this.mozo.add(this);

    }
    @Override
    public void update() {
        System.out.println(" "+Integer.toHexString(mozo.getState()));
    }
}
