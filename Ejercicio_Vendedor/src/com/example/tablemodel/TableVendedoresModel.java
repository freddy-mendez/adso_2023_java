package com.example.tablemodel;

import com.example.data.Vendedor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableVendedoresModel extends AbstractTableModel {
    ArrayList<Vendedor> datos;
    String [] titulos = 
                new String[]{"POS","Documento","Tipo de Vendedor","Ventas"};

    public TableVendedoresModel(ArrayList<Vendedor> datos) {
        this.datos = datos;
    }
    
    
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vendedor vendedor = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex;
            case 1:
                return vendedor.getDocumento();
            case 2:
                if (vendedor.getTipoVendedor()==0) {
                    return "PaP";
                } else {
                    return "TeleMercadeo";
                }
            /*case 3:
                return vendedor.getValorVentas();*/
            default:
                return "N/D";
        }
    }

    @Override
    public String getColumnName(int column) {
        return titulos[column];
    }  
}
