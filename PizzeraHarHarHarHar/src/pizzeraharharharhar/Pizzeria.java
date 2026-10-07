/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeraharharharhar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Revan
 */
public class Pizzeria {
    private String name;
    private List<Cliente> clientes;
    private List<Item> items;
    private List<Pedido> pedidos;

    public Pizzeria() {
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    
    
    
    public boolean addCliente(Cliente cliente){
        this.clientes.add(cliente);
        return true;
    }
    public boolean addItem(Item item){
        this.items.add(item);
        return true;
    }
    public boolean addPedido(Pedido pedido){
        this.pedidos.add(pedido);
        return false;
    }
    public Cliente getCliente(int index){
        return clientes.get(index);
    }
    
    public Item getItem(int index){
        return items.get(index);
    }
    
    
    public int calcProdMasVendidoCliente(int numCliente){
        Cliente cliente = this.clientes.get(numCliente);
        List<Pedido> pedido = cliente.getPedidos();
        int[] idCompare = new int[5];
        int prodMasVendido = -1;
        int indiceVendidos=-1;
        
        for (Pedido pe: pedido){
            List<Item> items = pe.getItems();
            for (Item it: items){
                switch(it.getNombre()){
                    case "Lasagna":
                        idCompare[0]++;
                        break;
                    case "Pizza hawaiana":
                        idCompare[1]++;
                        break;
                        
                    case "Calzone":
                        idCompare[2]++;
                        break;
                        
                    case "Pasta napolitana":
                        idCompare[3]++;
                        break;
                    case "Raviolis":
                        idCompare[4]++;
                        break;
                        
                }
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if (idCompare[i]>prodMasVendido){
                prodMasVendido=idCompare[i];
                indiceVendidos=i;
            }
        }
      
        
        return indiceVendidos;
    }
}
