
package com.mycompany.luiszapatafernandobuelvasreto4;
import java.util.Scanner;

public class platoRestaurante {
    
    
    
    private String nom;
    private String desc;
    private int cost;
    private int prec;
    private int cant;
    private String tipo;
    private int refv;
    
    
   
    public platoRestaurante(){
        
        this.nom = null;
        this.desc = null;
        this.cost = 0;
        this.prec = 0;
        this.cant = 0;
        this.tipo = null;
        this.refv = 999;
        
    }
    
    Scanner input = new Scanner(System.in);
    
    public void llenarProd(){
        
        
        System.out.println("Ingrese el nombre del producto: ");
        this.nom = input.nextLine();
        System.out.println("\n");
        
        System.out.println("Ingrese la descripción del producto: ");
        this.desc = input.nextLine();
        System.out.println("\n");
        
        System.out.println("Ingrese el costo de producción: ");
        this.cost = input.nextInt();
        System.out.println("\n");
        
        System.out.println("Ingrese el precio de venta: ");
        this.prec = input.nextInt();
        System.out.println("\n");
        
        System.out.println("Ingrese el promedio diario de ventas: ");
        this.cant = input.nextInt();
        System.out.println("\n");
        
        System.out.println("Defina el tipo de producto: ");
        this.tipo = input.next();
        System.out.println("\n");
    
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

        public void setRefv(int refv) {
            this.refv = refv;
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

        public int getRefv() {
            return refv;
        }


        public void mostrarCarta(){

            System.out.println(getNom());
            System.out.println(getDesc());
            System.out.println("Referencia de producto: " + getRefv());
            System.out.println("Costo de preparación: " + getCosto());
            System.out.println("Precio de venta: " + getPrecio());
            System.out.println("Promedio de ventas diarias: " + getCant());
            System.out.println("Tipo de producto: " + getTipo());
            System.out.println("\n");
         }
    
      
}
