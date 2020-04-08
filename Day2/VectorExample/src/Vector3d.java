public final class Vector3d extends AbstractVector {

    private final double x;
    private final double y;
    private final double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    @Override
    public AbstractVector addition(AbstractVector a, AbstractVector b) {
        return new Vector3d((a.getX() + b.getX()), (a.getY() + b.getY()), (a.getZ() + b.getZ()));
    }

    @Override
    public AbstractVector subtraction(AbstractVector a, AbstractVector b) {
        return new Vector3d((a.getX() - b.getX()), (a.getY() - b.getY()), (a.getZ() - b.getZ()));
    }

    @Override
    public double scalarMultiple(AbstractVector a) {
        return (this.getX() * a.getX()) + (this.getY() * a.getY()) + (this.getZ() * a.getZ());
    }

    @Override
    public AbstractVector multipleVectors(AbstractVector a, AbstractVector b) {
        double vecX = a.getY() * b.getZ() - a.getZ() * b.getY();
        double vecY = a.getZ() * b.getX() - a.getX() * b.getZ();
        double vecZ = a.getX() * b.getY() - a.getY() * b.getX();
        return new Vector3d(vecX, vecY, vecZ);
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}

