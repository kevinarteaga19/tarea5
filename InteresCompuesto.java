public class InteresCompuesto {

    private double c;

    private double n;

    private  double i;

    public InteresCompuesto(double c, double n, double i) {
        this.c = c;
        this.n = n;
        this.i = i;
    }

    public double getC() {

        return c;
    }

    public void setC(double c) {

        this.c = c;
    }

    public double getN() {

        return n;
    }

    public void setN(double n) {

        this.n = n;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getM(){
        double m;

        m = getC()*Math.pow((1+(getI()/100)),getN());

        return m;
    }
}
