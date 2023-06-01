package com.example.data;

import bd.ConectarBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendedorDAO {
    private ConectarBD db;

    public VendedorDAO() {
        this.db = new ConectarBD();
    }
    
    public ArrayList<Vendedor> getAll() {
        ArrayList<Vendedor> datos = new ArrayList<>();
        String sql = "select * from vendedores";
        try {
            PreparedStatement stm =
                    this.db.getConexion().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                long doc=rs.getLong("documento_vendedor");
                int tipo = rs.getInt("tipo_vendedor");
                float ventas = rs.getFloat("valor_ventas");
                Vendedor v = 
                        new Vendedor(doc, tipo, ventas);
                datos.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }
    
    public static void main(String[] args) {
        VendedorDAO vDao = new VendedorDAO();
        System.out.println(""+vDao.getAll());
    }
    
}
