/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeraharharharhar;

import java.util.List;

/**
 *
 * @author Revan
 */
public abstract class Pedido{
    protected Cliente cliente;
    protected List<Item> items;

    public Pedido(Cliente cliente, List<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }
    
    
}
