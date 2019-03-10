
package pkg4atema2caamal;

public class filaNewton {
    private int I;
    private double Xi, Fxi, dFxi, Xi1, Error;

    public int getI() {
        return I;
    }

    public void setI(int I) {
        this.I = I;
    }

    public double getXi() {
        return Xi;
    }

    public void setXi(double Xi) {
        this.Xi = Xi;
    }

    public double getFxi() {
        return Fxi;
    }

    public void setFxi(double Fxi) {
        this.Fxi = Fxi;
    }

    public double getdFxi() {
        return dFxi;
    }

    public void setdFxi(double dFxi) {
        this.dFxi = dFxi;
    }

    public double getXi1() {
        return Xi1;
    }

    public void setXi1(double Xi1) {
        this.Xi1 = Xi1;
    }

    public double getError() {
        return Error;
    }

    public void setError(double Error) {
        this.Error = Error;
    }

    @Override
    public String toString() {
        return "filaNewton{" + "I=" + I + ", Xi=" + Xi + ", Fxi=" + Fxi + ", dFxi=" + dFxi + ", Xi1=" + Xi1 + ", Error=" + Error + '}';
    }
    
}
