public class Cliente {
    private int cpf;
    private Pedido pedi;

    public Cliente(Sint cpf, Pedido pedi) {
        this.cpf = cpf;
        this.pedi = pedi;
    }

    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Pedido getPedi() {
        return pedi;
    }

    public void setPedi(Pedido pedi) {
        this.pedi = pedi;
    }
}
