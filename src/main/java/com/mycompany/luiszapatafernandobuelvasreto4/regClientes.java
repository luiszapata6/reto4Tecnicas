
package com.mycompany.luiszapatafernandobuelvasreto4;

public class regClientes extends regVentas {
    
    private String nomCliente;


    public regClientes(){

        super();
        this.nomCliente = null;

        }
    
        public void llenarCliente(){
            System.out.println("Ingrese nombre del cliente: ");
            this.nomCliente = input.next();
            System.out.println("\n");
        }
    
    

        public void setNomCliente(String nomCliente) {
            this.nomCliente = nomCliente;
        }

        public String getNomCliente() {
            return nomCliente;
        }

        public void mostrarCliente(){
            
            System.out.println("Nombre: " + getNomCliente());
            System.out.println("Documento: " + getTypeDocv() + " " + getDocv());
            System.out.println("\n");

        }

}
