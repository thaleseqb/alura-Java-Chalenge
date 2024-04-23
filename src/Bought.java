public class Bought implements Comparable<Bought>{
    private String description;
    private double value;

    public Bought(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Bought: description = " + description +
                " value = " + value;
    }

    @Override
    public int compareTo(Bought outraCompra) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(outraCompra.value));
    }
}
