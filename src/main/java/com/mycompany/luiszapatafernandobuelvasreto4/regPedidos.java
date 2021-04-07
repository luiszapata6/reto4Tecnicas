
package com.mycompany.luiszapatafernandobuelvasreto4;

public class regPedidos extends platoRestaurante {
    
    private String fechHora;
    private int numMesa;
    
    public regPedidos(){
    
        super();
        this.fechHora = null;
        this.numMesa = 0;
    
    }

    public void setFechHora(String fechHora) {
        this.fechHora = fechHora;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public String getFechHora() {
        return fechHora;
    }

    public int getNumMesa() {
        return numMesa;
    }
    
    public void mostrarPedido(){
        
        System.out.println("Fecha y hora de pedido: " + getFechHora());
        System.out.println("Número de mesa: " + getNumMesa());
        System.out.println("Producto: " + getNom());
        System.out.println("\n");
    
    }
    
}
