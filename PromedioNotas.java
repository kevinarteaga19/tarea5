public class PromedioNotas {

    private double t1;

    private double t2;

    private  double t3;

    private  double t4;

    private  double emc;

    private double efc;

    public PromedioNotas(double t1, double t2, double t3, double t4, double emc, double efc) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.emc = emc;
        this.efc = efc;
    }

    public double getT1() {

        return t1;
    }

    public void setT1(double t1) {

        this.t1 = t1;
    }

    public double getT2() {

        return t2;
    }

    public void setT2(double t2) {

        this.t2 = t2;
    }

    public double getT3() {

        return t3;
    }

    public void setT3(double t3) {

        this.t3 = t3;
    }

    public double getT4() {

        return t4;
    }

    public void setT4(double t4) {
        this.t4 = t4;
    }

    public double getEmc() {

        return emc;
    }

    public void setEmc(double emc) {

        this.emc = emc;
    }

    public double getEfc() {

        return efc;
    }

    public void setEfc(double efc) {

        this.efc = efc;
    }

    public double getPromedioTareas()
    {
        double promedioTareas;

        promedioTareas = ((this.t1+this.t2+this.t3+this.t4)/4);

        return promedioTareas;
    }
    public  double getPromedio()
    {

        double promedio;

        promedio = ((getPromedioTareas()+emc+efc)/3);

        return  promedio;
    }
}
