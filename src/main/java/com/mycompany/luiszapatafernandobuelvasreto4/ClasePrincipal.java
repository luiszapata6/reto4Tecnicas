/*

Desarrollado por:

Luis Fernando Zapata
Fernando Buelvas

*/

package com.mycompany.luiszapatafernandobuelvasreto4;

public class ClasePrincipal {
    
    public static void main(String[] args){
       
        
        platoRestaurante regPlatos[] = {
            new platoRestaurante(), 
            new platoRestaurante(), 
            new platoRestaurante()};
        
        regPlatos[0].setNom("AREPA DE CHÓCOLO");
        regPlatos[0].setDesc("Arepa de puro maíz. ");
        regPlatos[0].setCost(5000);
        regPlatos[0].setPrec(6500);
        regPlatos[0].setCant(160);
        regPlatos[0].setTipo("Desayuno");
        
        regPlatos[1].setNom("BANDEJA PAISA");
        regPlatos[1].setDesc("Plato típico antioqueño. ");
        regPlatos[1].setCost(15000);
        regPlatos[1].setPrec(19500);
        regPlatos[1].setCant(240);
        regPlatos[1].setTipo("Almuerzo");
        
        regPlatos[2].setNom("CHORIZO ANTIOQUEÑO");
        regPlatos[2].setDesc("De cerdo con limón y arepa. ");
        regPlatos[2].setCost(11000);
        regPlatos[2].setPrec(14300);
        regPlatos[2].setCant(214);
        regPlatos[2].setTipo("Comida");
       
        
        regVentas newVent[] = {
            new regVentas(), 
            new regVentas(), 
            new regVentas()};
        
        newVent[0].setNom(regPlatos[0].getNom());
        newVent[0].setCantv(4);
        newVent[0].setPrec(regPlatos[0].getPrecio()*newVent[0].getCantv());
        newVent[0].setFechav("05/04/2021");
        newVent[0].setTypeDocv("CC");
        newVent[0].setDocv(102836721);
        
        newVent[1].setNom(regPlatos[2].getNom());
        newVent[1].setCantv(5);
        newVent[1].setPrec(regPlatos[2].getPrecio()*newVent[1].getCantv());
        newVent[1].setFechav("05/04/2021");
        newVent[1].setTypeDocv("CC");
        newVent[1].setDocv(103683651);
        
        newVent[2].setNom(regPlatos[1].getNom());
        newVent[2].setCantv(3);
        newVent[2].setPrec(regPlatos[1].getPrecio()*newVent[2].getCantv());
        newVent[2].setFechav("05/04/2021");
        newVent[2].setTypeDocv("NIT");
        newVent[2].setDocv(900928101);
        
        regClientes hisClientes[] = {
            new regClientes(), 
            new regClientes(), 
            new regClientes()};
        
        hisClientes[0].setTypeDocv(newVent[0].getTypeDocv());
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
        nuevMesa[4].setDescMesa("Cómoda mesa para 2 personas.");
        
                
        System.out.println("CARTA: \n");
    
        for(int i = 0; i < regPlatos.length; i++){
            regPlatos[i].mostrarCarta();
        }
    
        System.out.println("VENTAS DEL DÍA: \n");
                
        for(int k = 0; k < newVent.length; k++ ){
            newVent[k].mostrarVenta();
        }
        
        System.out.println("REGISTRO DE CLIENTES: \n");
        
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
        }
                
    }   
         
}
