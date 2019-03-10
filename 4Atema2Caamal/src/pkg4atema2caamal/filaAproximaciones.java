/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4atema2caamal;

/**
 *
 * @author m
 */
public class filaAproximaciones {
    private int I;
    private double Xi, Gxi, Error;

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

    public double getGxi() {
        return Gxi;
    }

    public void setGxi(double Gxi) {
        this.Gxi = Gxi;
    }

    public double getError() {
        return Error;
    }

    public void setError(double Error) {
        this.Error = Error;
    }

    @Override
    public String toString() {
        return "filaAproximaciones{" + "I=" + I + ", Xi=" + Xi + ", Gxi=" + Gxi + ", Error=" + Error + '}';
    }
    
    
}
