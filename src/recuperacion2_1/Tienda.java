/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2_1;

import java.util.TreeSet;

/**
 *
 * @author Pedro JT
 */
public class Tienda {
    private String nombre;
    private TreeSet<Producto> misProductos;
    private float caja;

    public Tienda(String nombre, float caja) {
        this.nombre = nombre;
        this.caja = caja;
        misProductos = new TreeSet<>();
    }
    
    public Producto buscaProducto(String id) {
        for (Producto miProducto : misProductos) {
            if(id.equals(miProducto.getIdentificador())) {
                return miProducto;
            }
        }
        return null;
    }
    
    public void aniadirProducto(Producto nuevo) {
        if(caja < nuevo.getPrecioBase()) {
            System.out.println("NO HAY DINERO");
            return;
        }
        boolean esNuevo = misProductos.add(nuevo);
        if(!esNuevo) 
            System.out.println("Ya existe");
    }
    
    public void venderProducto (Producto demandado) {
        if(buscaProducto(demandado.getIdentificador())!=null)
            caja+=demandado.getBeneficio();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Producto> getMisProductos() {
        return misProductos;
    }

    public void setMisProductos(TreeSet<Producto> misProductos) {
        this.misProductos = misProductos;
    }

    public float getCaja() {
        return caja;
    }

    public void setCaja(float caja) {
        this.caja = caja;
    }
}
