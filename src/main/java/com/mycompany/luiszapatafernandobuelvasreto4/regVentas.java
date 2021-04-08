
package com.mycompany.luiszapatafernandobuelvasreto4;

import java.util.Scanner;


public class regVentas extends platoRestaurante{ 
    
    private int cantv;
    private String fechav;
    private String typeDocv;
    private int docv;
    private int codv;
    private int pcant;
          
    public regVentas(){
    
        super();
        this.cantv = 0;
        this.fechav = null;
        this.typeDocv = null;
        this.docv = 0;
        this.codv = 999;
        this.pcant = 0;
        
    }
    
    Scanner input = new Scanner(System.in);
    
    public void pedirDoc(){
        System.out.println("Tipo de documento del cliente: ");
        this.typeDocv = input.next();
        System.out.println("\n");
        
        System.out.println("Número de documento: ");
        this.docv = input.nextInt();
        System.out.println("\n");
    
    }
    
    public void pedirPcant(){
    
        System.out.println("Cantidad de platos del menú comprados: ");
        this.pcant = input.nextInt();
        System.out.println("\n");
    }
    
    public void llenarVenta(){
    
                
        System.out.println("Referencia de producto: ");
        this.codv = input.nextInt();
        System.out.println("\n");
        
        System.out.println("Cantidad de producto: ");
        this.cantv = input.nextInt();
        System.out.println("\n");
        
        System.out.println("Fecha de venta: ");
        this.fechav = input.next();
        System.out.println("\n");
        
        
    }
    
        
    public void setCantv(int cantv) {
        this.cantv = cantv;
    }
    
    public void setFechav(String fechav) {
        this.fechav = fechav;
    }

    public void setTypeDocv(String typeDocv) {
        this.typeDocv = typeDocv;
    }

    public void setPcant(int pcant) {
        this.pcant = pcant;
    }
    
    public void setDocv(int docv) {
        this.docv = docv;
    }

    public void setCodv(int codv) {
        this.codv = codv;
    }
    
    public int getCantv() {
        return this.cantv;
    }

    public String getFechav() {
        return this.fechav;
    }

    public String getTypeDocv() {
        return this.typeDocv;
    }

    public int getCodv() {
        return this.codv;
    }

    public int getPcant() {
        return pcant;
    }

    public int getDocv() {
        return this.docv;
    }

    public void mostrarVenta(){
        
        System.out.println("Producto: " + getNom());
        System.out.println("Cantidad: " + getCantv());
        System.out.println("Precio total: " + getPrecio());
        System.out.println("Fecha: " + getFechav());
        System.out.println("Documento cliente: " + getTypeDocv() + " " + getDocv());
        System.out.println("\n");
    }
  
}
    
    


    

