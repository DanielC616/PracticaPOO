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
        return false;
    }
    public boolean addItem(Item item){
        return false;
    }
    public boolean addPedido(Pedido pedido){
        return false;
    }
    public Cliente getCliente(int index){
        Cliente c = new Cliente("Test");
        return c;
    }
    public Item getItem(int index){
        Item i = new Item("Test", 0);
        return i;
    }
    public int calcProdMasVendidoCliente(int numCliente){
        return 0;
    }
}
