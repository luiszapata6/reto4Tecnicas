
package com.mycompany.luiszapatafernandobuelvasreto4;

public class regMesas extends regPedidos{
    
    private int capMesa;
    private String descMesa;
    
    public regMesas(){
        
        super();
        this.capMesa = 0;
        this.descMesa = null;

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
        System.out.println("Capacidad para: " + getCapMesa());
        System.out.println(getDescMesa());
        System.out.println("\n");
    
    }
    
}
