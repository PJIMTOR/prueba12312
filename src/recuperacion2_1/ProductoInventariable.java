/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2_1;

/**
 *
 * @author Pedro JT
 */
public class ProductoInventariable extends Producto {
    private int intervaloReposicion;

    public int getNumeroExistencias() {
        return intervaloReposicion;
    }

    public void setNumeroExistencias(int intervaloReposicion) {
        this.intervaloReposicion = intervaloReposicion;
    }
    
    
}
