package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.*;
/**
 * @author Arma X
 */
public class TMResultado extends AbstractTableModel {

    private ArrayList<ListaCSV> linhas;
    private String[] colunas = {"EstacaoCodigo","NivelConsistencia","Data",
        "TipoMedicaoChuvas","Maxima","Total","DiaMaxima","NumDiasDeChuva",
        "MaximaStatus","TotalStatus","NumDiasDeChuvaStatus","TotalAnual",
        "TotalAnualStatus","Chuva01","Chuva02","Chuva03","Chuva04","Chuva05",
        "Chuva06","Chuva07","Chuva08","Chuva09","Chuva10","Chuva11","Chuva12",
        "Chuva13","Chuva14","Chuva15","Chuva16","Chuva17","Chuva18","Chuva19",
        "Chuva20","Chuva21","Chuva22","Chuva23","Chuva24","Chuva25","Chuva26",
        "Chuva27","Chuva28","Chuva29","Chuva30","Chuva31"};
    
    public TMResultado() {
        this.linhas = new ArrayList<>();
    }

    public void addArquivo(ListaCSV arquivo) {
        this.linhas.add(arquivo);
        fireTableDataChanged();
    }

    public void deletarArquivo(int rowIndex) {
        this.linhas.remove(rowIndex);
        fireTableDataChanged();
    }

    public ListaCSV getArquivo(int rowIndex) {
        return this.linhas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                //return this.linhas.get(rowIndex).getData();
            case 1:
                //return this.linhas.get(rowIndex).getDados();
            default:
                return this.linhas.get(rowIndex);
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }
}
