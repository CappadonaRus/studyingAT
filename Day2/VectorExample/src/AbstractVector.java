public abstract class AbstractVector {

    private double x;
    private double y;
    private double z;

    public AbstractVector() {
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public abstract AbstractVector addition(AbstractVector a, AbstractVector b);

    public abstract AbstractVector subtraction(AbstractVector a, AbstractVector b);

    public abstract double scalarMultiple(AbstractVector a);

    public abstract AbstractVector multipleVectors(AbstractVector a, AbstractVector b);

}
