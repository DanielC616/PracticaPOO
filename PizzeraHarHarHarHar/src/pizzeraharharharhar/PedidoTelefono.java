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
public class PedidoTelefono extends Pedido{
    private String telefono;

    public PedidoTelefono(Cliente cliente,String telefono, List<Item> items) {
        super(cliente, items);
        this.telefono = telefono;
    }
    
}
