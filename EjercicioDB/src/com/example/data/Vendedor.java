package com.example.data;

public class Vendedor {
    private long documento;
    private int tipoVendedor;
    private float valorVentas;

    public Vendedor(long documento, int tipoVendedor) {
        this.documento = documento;
        this.tipoVendedor = tipoVendedor;
    }

    public Vendedor(long documento, int tipoVendedor, float valorVentas) {
        this.documento = documento;
        this.tipoVendedor = tipoVendedor;
        this.valorVentas = valorVentas;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public int getTipoVendedor() {
        return tipoVendedor;
    }

    public void setTipoVendedor(int tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public float getValorVentas() {
        return valorVentas;
    }

    public void setValorVentas(float valorVentas) {
        this.valorVentas = valorVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "documento=" + documento + ", tipoVendedor=" + tipoVendedor + ", valorVentas=" + valorVentas + '}';
    }
    
    
}
