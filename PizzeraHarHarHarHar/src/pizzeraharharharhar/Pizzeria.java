
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
        int[] idCompare = new int[5];
        int prodMasVendido = -1;
        
        
        for (Pedido pe: pedido){
            List<Item> items = pe.getItems();
            for (Item it: items){
                switch(it.getNombre()){
                    case "Lasagna":
                        idCompare[0]++;
                    case "Pizza hawaiana":
                        idCompare[1]++;
                    case "Calzone":
                        idCompare[2]++;
                    case "Pasta napolitana":
                        idCompare[3]++;
                    case "Raviolis":
                        idCompare[4]++;
                        
                }
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if (idCompare[i]>prodMasVendido){
                prodMasVendido=idCompare[i];
            }
        }
      
        
        return prodMasVendido;
    }
}




