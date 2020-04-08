public final class Vector2d extends AbstractVector {

    private final double x;
    private final double y;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public AbstractVector addition(AbstractVector a, AbstractVector b) {
        return new Vector2d((a.getX() + b.getX()), (a.getY() + b.getY()));
    }
    @Override
    public AbstractVector substraction(AbstractVector a, AbstractVector b) {
        return new Vector2d((a.getX() - b.getX()), (a.getY() - b.getY()));
    }
    @Override
    public AbstractVector scalarMultiple(AbstractVector a) {
        return new Vector2d((this.getX() * a.getX()), (this.getY() * a.getY()));
    }
    @Override
    public AbstractVector multipleVectors(AbstractVector a, AbstractVector b) {
        double vecX = a.getY() * b.getX() - a.getX() * b.getY();
        double vecY = a.getY() * b.getX() - a.getX() * b.getY();
        return new Vector2d(vecX, vecY);
    }

    @Override
    public String toString() {
        return "Vector2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
