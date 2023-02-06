package fasadDisaignPattern;

public class ShapMaker {
    private Shape dyere;
    private Shape moslas;
    public void ShapeMaker() {
        dyere = new Dayere();
        moslas = new Moslas();
    }
    public void drawDayere(){
        dyere.draw();
    }
    public void drawMoslas(){
        moslas.draw();
    }
}
