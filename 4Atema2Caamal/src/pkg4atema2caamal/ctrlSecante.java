
package pkg4atema2caamal;

import java.util.ArrayList;


public class ctrlSecante {
    private double X0, X1, errorDeseado;
    private int iteraciones;

    public ctrlSecante(double X0, double X1, double errorDeseado, int iteraciones) {
        this.X0 = X0;
        this.X1 = X1;
        this.errorDeseado = errorDeseado;
        this.iteraciones = iteraciones;
    }
    
    
    
    private double getEvaluacionFximenosuno(double ximenosuno){
        return Math.pow(Math.E,-(Math.pow(ximenosuno, 2)))-ximenosuno;
    }
    
    private double getEvaluacionFxi(double xi){
        return Math.pow(Math.E,-(Math.pow(xi, 2)))-xi;
    
    }
    
    private double getEvaluacionAproximacion(double ximenosuno, double xi){
        double numerador=this.getEvaluacionFxi(xi)*(ximenosuno-xi);
        double denominador =this.getEvaluacionFximenosuno(ximenosuno)-this.getEvaluacionFxi(xi);
        return numerador/denominador;
    
    }
    
    private double getXimasuno(double ximenosuno, double xi){
        return xi-this.getEvaluacionAproximacion(ximenosuno, xi);
    }
    
    private double getError(double xi, double ximasuno){
        return Math.abs((ximasuno-xi)/ximasuno);
    }
    
    public ArrayList<filaSecante> Secante(){
          int i=1;
          double ximenosuno=this.X0, xi=this.X1, fximenosuno, fxi, aproximacion, ximasuno, errorCalculado=1;
          ArrayList<filaSecante> listaSoluciones=new ArrayList<>();
          while(iteraciones>=i && errorCalculado>errorDeseado){
              fximenosuno=this.getEvaluacionFximenosuno(ximenosuno);
              fxi=this.getEvaluacionFxi(xi);
              aproximacion=this.getEvaluacionAproximacion(ximenosuno, xi);
              ximasuno=this.getXimasuno(ximenosuno, xi);
              errorCalculado=this.getError(xi, ximasuno);
              
              filaSecante fila=new filaSecante();
           
              fila.setI(i);
              fila.setXimenosuno(ximenosuno);
              fila.setXi(xi);
              fila.setFximenosuno(fximenosuno);
              fila.setFxi(fxi);
              fila.setAproximacion(aproximacion);
              fila.setXimasuno(ximasuno);
              fila.setError(errorCalculado);
              //actualizacion
              ximenosuno=xi;
              xi=ximasuno;
              i++;
              
              listaSoluciones.add(fila);
          }
          return listaSoluciones;
    }
    
    public tablaSecante getTablaSecante(){
        tablaSecante modelo=null;
        
        ArrayList <filaSecante> filas=this.Secante();
        modelo= new tablaSecante(filas);
        return modelo;
    }
}
