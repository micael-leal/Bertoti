public class Pedido {
    private String modeloDoCarro;
    private int anoDoCarro;
    private int placaDoCarro;
    private String corDoCarro;

    public Pedido(String modeloDoCarro, int anoDoCarro, int placaDoCarro, String corDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
        this.placaDoCarro = placaDoCarro;
        this.corDoCarro = corDoCarro;
    }
 
    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public int getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    public int getPlacaDoCarro() {
        return placaDoCarro;
    }

    public void setPlacaDoCarro(int placaDoCarro) {
        this.placaDoCarro = placaDoCarro;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }
    
    public boolean  comparar(Pedido pedido){
        if(modeloDoCarro.equals(pedido.modeloDoCarro)&&
            anoDoCarro ==(pedido.anoDoCarro)&&
            placaDoCarro ==(pedido.placaDoCarro)&&
            corDoCarro.equals(pedido.corDoCarro)){
        return true;
        }else{
            return false;
        }
    }       
     
}
