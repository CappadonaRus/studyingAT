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

    public abstract AbstractVector substraction(AbstractVector a, AbstractVector b);

    public abstract AbstractVector scalarMultiple(AbstractVector a);

    public abstract AbstractVector multipleVectors(AbstractVector a, AbstractVector b);

}
