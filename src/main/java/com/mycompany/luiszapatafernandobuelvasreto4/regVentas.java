
package com.mycompany.luiszapatafernandobuelvasreto4;


public class regVentas extends platoRestaurante{ 
    
    private int cantv;
    private String fechav;
    private String typeDocv;
    private int docv;
          
    public regVentas(){
    
        super();
        this.cantv = 0;
        this.fechav = null;
        this.typeDocv = null;
        this.docv = 0;
        
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

    public void setDocv(int docv) {
        this.docv = docv;
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
    
    


    

