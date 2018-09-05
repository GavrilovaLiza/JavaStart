public class Triangle {

    private double ab;
    private double bc;
    private double ca;

    public Triangle(double ab, double bc, double ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    public Triangle() {
        super();
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    public double getBc() {
        return bc;
    }

    public void setBc(double bc) {
        this.bc = bc;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    protected double trianglesArea(){
        double p = (ab+bc+ca)/2;
        double s = Math.sqrt(p*(p - ab)*(p - bc)*(p - ca));
        return s;
    }
}
