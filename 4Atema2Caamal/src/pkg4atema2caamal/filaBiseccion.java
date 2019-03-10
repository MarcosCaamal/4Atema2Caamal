/*Autor: Marcos Abraham Caamal Tzuc*/
package pkg4atema2caamal;


public class filaBiseccion {
    private int i;
    private double xi;
    private double xs;
    private double xr, fxi, fxs, fxr, error;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXs() {
        return xs;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxs() {
        return fxs;
    }

    public void setFxs(double fxs) {
        this.fxs = fxs;
    }

    public double getFxr() {
        return fxr;
    }

    public void setFxr(double fxr) {
        this.fxr = fxr;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "filaBiseccion{" + "i=" + i + ", xi=" + xi + ", xs=" + xs + ", xr=" + xr + ", fxi=" + fxi + ", fxs=" + fxs + ", fxr=" + fxr + ", error=" + error + '}';
    }
    
    
}
