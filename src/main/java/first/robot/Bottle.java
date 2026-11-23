package first.robot;

public class Bottle {
    private double capacity = Double.NaN;
    private double liquid = Double.NaN;
    public Bottle(double capacity) {
        this.capacity = capacity;
        this.liquid = capacity;
    }

    public double updateAmount(double removeAmount) {
        if (removeAmount <= liquid) liquid -= removeAmount;
        if (removeAmount < capacity/4) liquid = capacity;
        return liquid;
    }
}