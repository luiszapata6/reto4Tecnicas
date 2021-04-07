
package com.mycompany.luiszapatafernandobuelvasreto4;

public class platoRestaurante {
    
    
    private String nom;
    private String desc;
    private int cost;
    private int prec;
    private int cant;
    private String tipo;
    
   
    public platoRestaurante(){
        
        this.nom = null;
        this.desc = null;
        this.cost = 0;
        this.prec = 0;
        this.cant = 0;
        this.tipo = null;
        
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setPrec(int prec) {
        this.prec = prec;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    public int getCosto(){
        return this.cost;
    }   
    
    public int getPrecio(){
        return this.prec;
    }   
    
    public int getCant(){
    return this.cant;
    }   
    
    public String getTipo(){
        return this.tipo;
    }   
    
    public void mostrarCarta(){
        
        System.out.println(getNom());
        System.out.println(getDesc());
        System.out.println("Costo de preparación: " + getCosto());
        System.out.println("Precio de venta: " + getPrecio());
        System.out.println("Promedio de ventas diarias: " + getCant());
        System.out.println(getTipo());
        System.out.println("\n");
     }
    
      
}
