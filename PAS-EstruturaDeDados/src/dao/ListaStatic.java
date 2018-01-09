package dao;

public class ListaStatic {
    
    private static ListaStatic instance;
    
    private ListaStatic(){
        
    }
    
    public static ListaStatic getInstance(){
        if(instance == null)
            instance = new ListaStatic();
        return instance;
    }
    
}
