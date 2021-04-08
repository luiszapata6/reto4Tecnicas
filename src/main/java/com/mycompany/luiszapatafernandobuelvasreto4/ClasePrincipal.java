

package com.mycompany.luiszapatafernandobuelvasreto4;
import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese cantidad de platos a crear: ");
        int numPlat = input.nextInt();
        System.out.println("\n");
            
        
        platoRestaurante regPlatos[] = new platoRestaurante[numPlat];
                   
        for(int p = 0; p < regPlatos.length; p++ ){
            
            regPlatos[p] = new platoRestaurante();
            regPlatos[p].llenarProd();
            regPlatos[p].setRefv(p);
            
            /*regPlatos[p].setNom(regPlatos[p].getNom());
            regPlatos[p].setDesc(regPlatos[p].getDesc());*/
            /*regPlatos[p].setCost(regPlatos[p].getCosto());
            regPlatos[p].setPrec(regPlatos[p].getPrecio());
            regPlatos[p].setCant(regPlatos[p].getCant());
            regPlatos[p].setTipo(regPlatos[p].getTipo());*/
            
        }
        
         System.out.println("CARTA: \n");
    
        for(int i = 0; i < regPlatos.length; i++){
            regPlatos[i].mostrarCarta();
        }
        
        System.out.println("\n Ingrese cantidad de ventas a registrar: ");
        int numVent = input.nextInt();
        System.out.println("\n");
        
        
        regVentas newVent[] = new regVentas[numVent];
        
        for(int w = 0; w < newVent.length; w++){
            newVent[w] = new regVentas();
        }
        
        for(int z = 0; z < newVent.length; z++ ){
              
            newVent[z].pedirDoc();
            newVent[z].pedirPcant();
            System.out.println(newVent[z].getPcant());
            System.out.println(newVent.length);
            
            for(int y = 0; y < newVent[z].getPcant(); y++){
            
            
            newVent[y].llenarVenta();
            newVent[y].setNom(regPlatos[newVent[z].getCodv()].getNom());
            newVent[y].setPrec(regPlatos[newVent[z].getCodv()].getPrecio()*newVent[z].getCantv());
            newVent[y].setTypeDocv(newVent[z].getTypeDocv());
            newVent[y].setDocv(newVent[z].getDocv());
     
            
            }
            
            // newVent[z].setCodv(newVent[z].getCodv());
            // newVent[z].setCantv(newVent[z].getCantv());
            // newVent[z].setFechav(newVent[z].getFechav());
            // newVent[z].setTypeDocv(newVent[z].getTypeDocv());
            // newVent[z].setDocv(newVent[z].getDocv());
                
        }
        
        
       
        System.out.println("Cantidad de clientes a registrar: " + numVent);
        int numClient = numVent;
        System.out.println("\n");
        
        
        /*regClientes hisClient[] = new regClientes[numClient];
        
        for(int x = 0; x < hisClient.length; x++ ){
            hisClient[x] =  new regClientes();
            hisClient[x].llenarCliente();
            }*/
        
        
        /*hisClientes[0].setTypeDocv(newVent[0].getTypeDocv());
        hisClientes[0].setDocv(newVent[0].getDocv());
        hisClientes[0].setNomCliente("Luis Zapata");
        
        hisClientes[1].setTypeDocv(newVent[1].getTypeDocv());
        hisClientes[1].setDocv(newVent[1].getDocv());
        hisClientes[1].setNomCliente("Jose Buelvas");
        
        hisClientes[2].setTypeDocv(newVent[2].getTypeDocv());
        hisClientes[2].setDocv(newVent[2].getDocv());
        hisClientes[2].setNomCliente("INVERSIONES ANONIMAS SAS");
        
        regPedidos nuevPed[] = {
            new regPedidos(), 
            new regPedidos(), 
            new regPedidos()};
        
        nuevPed[0].setFechHora("05/04/2021 - 09:20:45");
        nuevPed[0].setNumMesa(3);
        nuevPed[0].setNom(regPlatos[0].getNom());
        
        nuevPed[1].setFechHora("05/04/2021 - 17:10:21");
        nuevPed[1].setNumMesa(4);
        nuevPed[1].setNom(regPlatos[2].getNom());
        
        nuevPed[2].setFechHora("05/04/2021 - 12:45:19");
        nuevPed[2].setNumMesa(1);
        nuevPed[2].setNom(regPlatos[1].getNom());
        
        regMesas nuevMesa[] = {
            new regMesas(),
            new regMesas(),
            new regMesas(),
            new regMesas(),
            new regMesas(),
        };
        
        nuevMesa[0].setNumMesa(1);
        nuevMesa[0].setCapMesa(4);
        nuevMesa[0].setDescMesa("Cómoda mesa para 4 personas.");
                
        nuevMesa[1].setNumMesa(2);
        nuevMesa[1].setCapMesa(2);
        nuevMesa[1].setDescMesa("Cómoda mesa para 2 personas.");
        
        nuevMesa[2].setNumMesa(3);
        nuevMesa[2].setCapMesa(4);
        nuevMesa[2].setDescMesa("Cómoda mesa para 4 personas.");
        
        nuevMesa[3].setNumMesa(4);
        nuevMesa[3].setCapMesa(6);
        nuevMesa[3].setDescMesa("Cómoda mesa para 6 personas.");
        
        nuevMesa[4].setNumMesa(5);
        nuevMesa[4].setCapMesa(2);
        nuevMesa[4].setDescMesa("Cómoda mesa para 2 personas.");*/
        
                
    
        
        
        /*System.out.println("REGISTRO DE CLIENTES: \n");
        
        for(int j = 0; j < hisClientes.length; j++){
             hisClientes[j].mostrarCliente();   
        }
        
        System.out.println("REGISTRO DE PEDIDOS: \n");
        
        for(int t = 0; t < nuevPed.length; t++){
            nuevPed[t].mostrarPedido();
        }
        
        System.out.println("REGISTRO DE MESAS: \n");
        
        for(int w = 0; w < nuevMesa.length; w++){
            nuevMesa[w].mostrarMesas();
        }*/
                
    }   
         
}
