
package pkg4atema2caamal;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ctrlNewton {
    private int iteraciones;
    private double xi, errorDeseado;

    public ctrlNewton(double xi, double errorDeseado,int iteraciones) {
        this.iteraciones = iteraciones;
        this.xi = xi;
        this.errorDeseado = errorDeseado;
    }
    
    private double getEvaluacionFxi(double xi){
        return Math.pow(Math.E, (-xi))-xi;
    }
    
    private double getEvaluacionDerivadaFxi(double xi){
        return -(Math.pow((Math.E), (-xi)))-1;
    }
    
    private double getXi1(double xi, double fxi, double dfxi){
        return xi-(fxi/dfxi);
    
    }
    
    private double getError(double xi1,double  xi){
        return Math.abs((xi1-xi)/xi1);
    }
    
    public ArrayList<filaNewton> Newton(){
        int i=1;
        double errorCalculado=1;
        double fxi, dfxi, xi1;
        ArrayList<filaNewton> listaSoluciones= new ArrayList();
        while(this.iteraciones>=i && errorCalculado>this.errorDeseado){
            fxi=this.getEvaluacionFxi(this.xi);
            dfxi=this.getEvaluacionDerivadaFxi(this.xi);
            xi1=this.getXi1(this.xi, fxi, dfxi);
            errorCalculado=this.getError(xi1, this.xi);

            filaNewton fila= new filaNewton();
            
            fila.setI(i);
            fila.setXi(this.xi);
            fila.setFxi(fxi);
            fila.setdFxi(dfxi);
            fila.setXi1(xi1);
            fila.setError(errorCalculado);
            this.xi=xi1;
            listaSoluciones.add(fila); 
            i++;
            if(i>this.iteraciones && errorCalculado>this.errorDeseado){
                 JOptionPane.showMessageDialog(null,"NO SE HA ENCONTRADO UNA SOLUCIÓN... \nINGRESE UN NÚMERO MAYOR DE: 'MÁX. ITERACION'");
            }
        }
        return listaSoluciones;
    }
    
    public tablaNewton getTablaNewton(){
        tablaNewton modelo=null;
        
        ArrayList <filaNewton> filas=this.Newton();
       
        modelo= new tablaNewton(filas);
        return modelo;
        
    
    }
}
