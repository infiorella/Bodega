package negocio;

public class Item {
    private Articulo art;
    private int can;
    
    public double getImp(){
        return art.getPre()*can;
    }
    
    
}
