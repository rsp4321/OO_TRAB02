package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.*;
/**
 * @author Arma X
 */
public class TMResultado extends AbstractTableModel { ArrayList<RegistroVazao> lista;
    
    public TMResultado(ArrayList<RegistroVazao> lista) {
        this.lista = lista;
    }
    
    @Override
    public String getValueAt(int row, int column) {
        RegistroVazao r = lista.get(row);
        if(column == 0) return r.getData();
        if(column == 1) return r.getNivelConsistencia();
        if(column == 2) return r.getMediaDiaria();
        if(column > 2 && column <= 34) return r.getVazao(column - 17);
        return "-";
    }
    @Override
    public int getColumnCount() {
        return 34;
    }
    
    @Override
    public String getColumnName(int coluna) {
        if(coluna == 0) return "Mes/Ano";
        if(coluna == 1) return "Consistido";
        if(coluna == 2) return "% Fail";
        if(coluna > 2 && coluna <= 34) return "Vazao" + Integer.toString(coluna - 16);
        return "-";
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }
}
