
package com.mycompany.luiszapatafernandobuelvasreto4;

public class regMesas extends regPedidos{
    
    private int capMesa;
    private String descMesa;
    
    public regMesas(){
        
        super();
        this.capMesa = 0;
        this.descMesa = null;

    }
    
    public void llenarMesa(){
        
        System.out.println("Ingrese capacidad de mesa: ");
        this.capMesa = input.nextInt();
        System.out.println("\n");
        
        System.out.println("Ingrese descripción de mesa: ");
        this.descMesa = input.next();
        System.out.println("\n");
    
    }
    
    
    public void setCapMesa(int capMesa) {
        this.capMesa = capMesa;
    }

    public void setDescMesa(String descMesa) {
        this.descMesa = descMesa;
    }

    public int getCapMesa() {
        return capMesa;
    }

    public String getDescMesa() {
        return descMesa;
    }
    
    public void mostrarMesas(){
    
        System.out.println("Número de mesa: " + getNumMesa());
        System.out.println("Capacidad: " + getCapMesa());
        System.out.println(getDescMesa());
        System.out.println("\n");
    
    }
    
}
