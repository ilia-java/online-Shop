package products;

public class Case {
    private int id;
    private int size;
    private String processNumber;
    private int graficModel;

    public Case(int id, int size, String processNumber, int graficModel) {
        this.id = id;
        this.size = size;
        this.processNumber = processNumber;
        this.graficModel = graficModel;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public String getProcessNumber() {
        return processNumber;
    }

    public int getGraficModel() {
        return graficModel;
    }

    @Override
    public String toString() {
        return "Case{" +
                "size=" + size +
                ", graficModel='" + graficModel + '\'' +
                ", processNumber=" + processNumber +
                '}';
    }
}
