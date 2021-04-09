/*
    Desarrollado por:
    Luis Fernando Zapata
    Fernando Jose Buelvas
*/

package com.mycompany.luiszapatafernandobuelvasreto4;
import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("REGISTRO DE PLATOS: \n");
        System.out.println("Ingrese cantidad de platos a crear: ");
        int numPlat = input.nextInt();
        System.out.println("\n");
            
        
        platoRestaurante regPlatos[] = new platoRestaurante[numPlat];
                   
        for(int p = 0; p < regPlatos.length; p++ ){
            
            regPlatos[p] = new platoRestaurante();
            System.out.println("Plato #" + (p+1) + "\n");
            regPlatos[p].llenarProd();
            regPlatos[p].setRefv(p);
            
        }
        
         System.out.println("CARTA: \n");
    
        for(int i = 0; i < regPlatos.length; i++){
            regPlatos[i].mostrarCarta();
        }
        
        System.out.println("REGISTRO DE VENTAS: \n");
        
        System.out.println("\nIngrese cantidad de ventas a registrar: ");
        int numVent = input.nextInt();
        System.out.println("\n");

        
        regVentas newVent[] = new regVentas[numVent];
        
                
        for(int w = 0; w < newVent.length; w++){
            
            newVent[w] = new regVentas();
            System.out.println("Venta #" + (w+1) + "\n");
            newVent[w].pedirDoc();
            newVent[w].llenarVenta();
            newVent[w].setNom(regPlatos[newVent[w].getCodv()].getNom());
            newVent[w].setPrec(regPlatos[newVent[w].getCodv()].getPrecio()*newVent[w].getCantv());
                    
            
        }
            
        System.out.println("VENTAS REGISTRADAS: \n");
    
        for(int y = 0; y < newVent.length; y++){
            newVent[y].mostrarVenta();
        }
        
        System.out.println("REGISTRO DE CLIENTES: \n");
            
        System.out.println("Ingrese cantidad de clientes a registrar: ");
        int numClient = input.nextInt();
        System.out.println("\n");
        
           
       regClientes hisClient[] = new regClientes[numClient];
        
        for(int x = 0; x < hisClient.length; x++ ){
            hisClient[x] =  new regClientes();
            System.out.println("Cliente #" + (x+1) + "\n");
            hisClient[x].pedirDoc();
            hisClient[x].llenarCliente();
            }
        
        System.out.println("CLIENTES REGISTRADOS: \n");
        
        for(int t = 0; t < hisClient.length; t++){
            hisClient[t].mostrarCliente();
        }
        
        System.out.println("REGISTRO DE PEDIDOS: \n");
      
        System.out.println("Ingrese cantidad de pedidos a registrar:");
        int cantPed = input.nextInt();
        System.out.println("\n");
        
        regPedidos nuevPed[] = new regPedidos[cantPed];
       
        for(int q = 0; q < nuevPed.length; q++){
            
            nuevPed[q] = new regPedidos();
            System.out.println("Pedido #" + (q+1) + "\n");
            nuevPed[q].datPedido();
            nuevPed[q].pedirMesa();
            nuevPed[q].setNom(regPlatos[nuevPed[q].getRefped()].getNom());
        }
        
        System.out.println("PEDIDOS REGISTRADOS:\n");
        
        for(int v = 0; v <nuevPed.length; v++){
            nuevPed[v].mostrarPedido();
        } 

        System.out.println("REGISTRO DE MESAS: \n");
        
        System.out.println("Ingrese cantidad de mesas a registrar:");
        int cantMesa = input.nextInt();
        System.out.println("\n");
        
        regMesas nuevMesa[] = new regMesas[cantMesa];
        
        for(int m = 0; m < nuevMesa.length; m++){
            
            nuevMesa[m] = new regMesas();
            
            System.out.println("Mesa #" + (m+1) + "\n");
            nuevMesa[m].llenarMesa();
            nuevMesa[m].setNumMesa(m+1);
        
        }
        
        System.out.println("REGISTRO DE MESAS: \n");
        
        for(int n = 0; n < nuevMesa.length; n++){
            nuevMesa[n].mostrarMesas();
        }                
    } 
}


