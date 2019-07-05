public class QuadraticEquation {
    private int a, b, c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public float getRoot1() {
        return (-this.b + (float) Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public float getRoot2() {
        return (-this.b - (float) Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
}
