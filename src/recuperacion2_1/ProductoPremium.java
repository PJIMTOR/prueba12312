/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2_1;

/**
 *
 * @author Pedro JT
 */
public class ProductoPremium extends Producto {

    private short aniosGarantia;
    private String empresaCertificadora;

    public short getAniosGarantia() {
        return aniosGarantia;
    }

    public void setAniosGarantia(short aniosGarantia) {
        this.aniosGarantia = aniosGarantia;
    }

    public String getEmpresaCertificadora() {
        return empresaCertificadora;
    }

    public void setEmpresaCertificadora(String empresaCertificadora) {
        this.empresaCertificadora = empresaCertificadora;
    }

}
