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
        List<Pedido> pedido = this.pedidos;
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        
        
        for (Pedido pe: pedido){
            List<Item> items = pe.getItems();
            for (Item it: items){
                switch(it.getNombre()){
                    case "Lasagna":
                        c1++;
                    case "Pizza hawaiana":
                        c2++;
                    case "Calzone":
                        c3++;
                    case "Pasta napolitana":
                        c4++;
                    case "Raviolis":
                        c5++;
                        
                }
            }
        }
        
        
      
        
        return 0;
    }
}
