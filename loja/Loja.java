import java.util.LinkedList;
import java.util.List;

public class Loja {
    private List<Cliente> clientes = new LinkedList<Cliente>();
    
    public void cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public List<Cliente> buscarClientePorPedido(Pedido pedi){
        List<Cliente> clientesEncontrados = new LinkedList<Cliente>();
        for (Cliente cliente:clientes){
            if(cliente.getPedi().comparar(pedi)) clientesEncontrados.add(cliente);
        }
        return clientesEncontrados;
    }
    public Cliente buscarClientePorCpf(int cpf){
        for(Cliente cliente:clientes){
            if(cliente.getCpf() == (cpf)){
                return cliente;
            }      
        }
        return null; 
    }  
    public List<Cliente> getClintes(){
        return this.clientes;
    }
}