
package com.mycompany.luiszapatafernandobuelvasreto4;

public class regPedidos extends platoRestaurante {
    
    private String fecha;
    private String hora;
    private int numMesa;
    private int refped;
    
    public regPedidos(){
    
        super();
        this.fecha = null;
        this.hora = null;
        this.numMesa = 0;
        this.refped = 999;
        
    
    }
        
    public void datPedido(){
        
        System.out.println("Fecha del pedido:");
        this.fecha = input.nextLine();
        System.out.println("\n");
        
        System.out.println("Hora del pedido:");
        this.hora = input.nextLine();
        System.out.println("\n");
        
        System.out.println("Referencia plato ordenado:");
        this.refped = input.nextInt();
        System.out.println("\n");
    }
    
    public void pedirMesa(){
        
        System.out.println("Ingrese número de mesa: ");
        this.numMesa = input.nextInt();
        System.out.println("\n");
        
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setRefped(int refped) {
        this.refped = refped;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getRefped() {
        return refped;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getNumMesa() {
        return numMesa;
    }
    
    public void mostrarPedido(){
        
        System.out.println("Fecha y hora de pedido: " + getFecha() + " - " + getHora());
        System.out.println("Número de mesa: " + getNumMesa());
        System.out.println("Producto: " + getNom());
        System.out.println("\n");
    
    }
    
}
