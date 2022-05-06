/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2_1;

/**
 *
 * @author Pedro JT
 */
public abstract class Producto implements Comparable<Producto> {
    private String identificador;
    private float precioBase;
    private float beneficio;
    
    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the precioBase
     */
    public float getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * @return the beneficio
     */
    public float getBeneficio() {
        return beneficio;
    }

    /**
     * @param beneficio the beneficio to set
     */
    public void setBeneficio(float beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public int compareTo(Producto o) {
        return o.identificador.compareTo(this.identificador);
    }
    
    
}
