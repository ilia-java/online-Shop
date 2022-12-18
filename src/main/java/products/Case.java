package products;

public class Case {
    private int id;
    private int size;
    private int processNumber;
    private String graficModel;

    public Case(int id, int size, int processNumber, String graficModel) {
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

    public int getProcessNumber() {
        return processNumber;
    }

    public String getGraficModel() {
        return graficModel;
    }

    @Override
    public String toString() {
        return "Case{" +
                "id=" + id +
                ", size=" + size +
                ", processNumber=" + processNumber +
                ", graficModel='" + graficModel + '\'' +
                '}';
    }
}
