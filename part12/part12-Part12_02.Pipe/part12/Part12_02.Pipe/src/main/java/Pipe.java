public class Pipe {
    private final int length;
    private final int diameter;

    public Pipe(int length, int diameter) {
        this.length = length;
        this.diameter = diameter;
    }

    public int getLength() {
        return this.length;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public int getVolume() {
        return (int) (Math.PI * Math.pow(this.diameter / 2.0, 2) * this.length);
    }

    public int getSurfaceArea() {
        return (int) (2 * Math.PI * this.diameter * this.length + 2 * Math.PI * Math.pow(this.diameter / 2.0, 2));
    }

    public String toString() {
        return "Length: " + this.length + ", diameter: " + this.diameter;
    }
}
