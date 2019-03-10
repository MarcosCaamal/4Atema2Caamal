/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4atema2caamal;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author m
 */
public class tablaBiseccion extends AbstractTableModel{
    public String[] columnas={"i", "Xi", "Xs", "Xr", "Fxi", "Fxs", "Fxr", "Error"};
    public Class[] tipos={Integer.class, Double.class,  Double.class,  Double.class, Double.class, 
                            Double.class, Double.class, Double.class};
    private ArrayList<filaBiseccion> filas;

    public tablaBiseccion(ArrayList<filaBiseccion> filas) {
        this.filas=filas;
    }
    
    @Override
    public int getRowCount() {
         return this.filas.size();
    }

    @Override
    public int getColumnCount() {

        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        filaBiseccion fila= this.filas.get(i);
        switch(i1){
            case 0: return fila.getI();     
            case 1: return fila.getXi();
                    
            case 2: return fila.getXs();
            case 3: return fila.getXr();
            case 4: return fila.getFxi();
            case 5: return fila.getFxs();
            case 6: return fila.getFxr();
            case 7: return fila.getError();
        
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public Class<?> getColumnClass(int i) {
       //return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
       return this.tipos[i];
    }

    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
        return this.columnas[i];
    
    }
    
}
