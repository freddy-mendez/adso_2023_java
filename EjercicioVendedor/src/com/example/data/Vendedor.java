package com.example.data;

public class Vendedor {
    private long documento;
    private byte tipoVendedor;
    private float ventasMes;

    public Vendedor(long documento, byte tipoVendedor, float ventasMes) {
        this.documento = documento;
        this.tipoVendedor = tipoVendedor;
        this.ventasMes = ventasMes;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public byte getTipoVendedor() {
        return tipoVendedor;
    }

    public void setTipoVendedor(byte tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public float getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(float ventasMes) {
        this.ventasMes = ventasMes;
    }
    
    public float getComision() {
        float comision=0;
        if (this.tipoVendedor==1) {
            comision=ventasMes*0.25F;
        } else if (this.tipoVendedor==2) {
            comision=ventasMes*0.20F;
        } else {
            comision=0;
        }
        return comision;
    }
    
}
