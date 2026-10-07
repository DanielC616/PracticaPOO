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
public class Cliente {
    private String nombre;
    private List<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }
   
    public boolean addPedido(Pedido pedido){
        pedidos.add(pedido);
        return true;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    
}
