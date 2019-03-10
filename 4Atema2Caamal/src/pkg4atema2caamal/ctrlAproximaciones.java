/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4atema2caamal;

import java.util.ArrayList;

/**
 *
 * @author m
 */
public class ctrlAproximaciones {
    private double xi, errorDeseado; 
    private int iteraciones;

    public ctrlAproximaciones(double xi, double errorDeseado, int iteraciones) {
        this.xi = xi;
        this.errorDeseado = errorDeseado;
        this.iteraciones = iteraciones;
    }
    
    private double getEvaluacionGxi(double xi){
       // return Math.pow(Math.E,(-xi));
       return (0.08314*215)/(70+(1.463/(Math.pow(xi, 2))))+0.0394;
    }
    
    private double getError(double gxi, double xi){
        return Math.abs((gxi-xi)/gxi);
    
    }
    
    public ArrayList<filaAproximaciones> Aproximaciones(){
        int i=1;
        double errorCalculado=1;
        double gxi;
        ArrayList<filaAproximaciones> listaSoluciones=new ArrayList<>();
        while(i<=this.iteraciones && errorCalculado>this.errorDeseado){
            gxi=this.getEvaluacionGxi(this.xi);
            filaAproximaciones fila=new filaAproximaciones();
            fila.setI(i);
            fila.setXi(this.xi);
            fila.setGxi(gxi);
           
            errorCalculado=this.getError(gxi, this.xi);
            
            fila.setError(errorCalculado);
            this.xi=(gxi);
            
            listaSoluciones.add(fila);
            i++;
        
        
        }
   
        return listaSoluciones;
    }
    
    public tablaAproximaciones getTablaAproximaciones(){
        tablaAproximaciones modelo=null;
        
        ArrayList<filaAproximaciones> lista=this.Aproximaciones();
        
        modelo=new tablaAproximaciones(lista);
        return modelo;
    
    }
}
