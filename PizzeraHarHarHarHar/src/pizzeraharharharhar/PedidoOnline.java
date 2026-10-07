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
public class PedidoOnline extends Pedido {
    private String email;

    public PedidoOnline(Cliente cliente, String email,  List<Item> items) {
        super(cliente, items);
        this.email = email;
    }
    

}
