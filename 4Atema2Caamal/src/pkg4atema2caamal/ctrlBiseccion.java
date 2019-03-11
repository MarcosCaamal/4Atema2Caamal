/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4atema2caamal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author m
 */
public class ctrlBiseccion {
    private double xi, xs, errorDeseado; 
    private int iteraciones;

    public ctrlBiseccion(double xi, double xs, double errorDeseado, int iteraciones) {
        this.xi = xi;
        this.xs = xs;
        this.errorDeseado = errorDeseado;
        this.iteraciones = iteraciones;
    }
    
    public boolean esRangoValido(){
        boolean valido=false;
        if(this.getEvaluacion(this.xi)*this.getEvaluacion(this.xs)<0)
            valido=true;
        return valido;
    }
    
    public double getEvaluacion(double x){
        return Math.pow(x, 3)+4*Math.pow(x, 2)-10;
    
    }
    
    private double getRaiz(double x1, double x2){
    return (x1+x2)/2;
    
    }
    
    private double getError(double xActual, double xAnterior){
        return Math.abs((xActual-xAnterior)/xActual);
    }
    
    public  ArrayList<filaBiseccion> Biseccion(){
        int i=1;
        double errorCalculado=1;
        double xr;
        ArrayList<filaBiseccion> listaSoluciones= new ArrayList<>();
        if(this.esRangoValido()){
            while(i<=this.iteraciones && errorCalculado>this.errorDeseado){
                xr=this.getRaiz(this.xi, this.xs);
                filaBiseccion fila=new filaBiseccion();
                fila.setI(i);
                fila.setXi(this.xi);
                fila.setXs(this.xs);
                fila.setXr(xr);
                fila.setFxi(this.getEvaluacion(fila.getXi()));
                fila.setFxr(this.getEvaluacion(fila.getXr()));
                fila.setFxs(this.getEvaluacion(fila.getXs()));
                
                if(i==1){
                    errorCalculado=1;
                
                }
                else{
                    double xrAnterior=listaSoluciones.get(listaSoluciones.size()-1).getXr();
                    double xrActual=fila.getXr();
                    errorCalculado= this.getError(xrActual, xrAnterior);
                    
                }
                fila.setError(errorCalculado);
                
                if(fila.getFxi()*fila.getFxr()<0){
                    this.xs=fila.getXr();
                
                }else
                {
                  
                    this.xi=fila.getXr();
                
                }
                listaSoluciones.add(fila);
                i++;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"NO HAY SOLUCION, RANGO NO VALIDO");
            listaSoluciones=null;
        }
            
        return listaSoluciones;
    }
    public tablaBiseccion geTablaBiseccion(){
        tablaBiseccion modelo=null;
        
        ArrayList <filaBiseccion> lista = this.Biseccion();
        if(lista!=null)
            modelo=new tablaBiseccion(lista);
        return modelo;
    
    }
}
