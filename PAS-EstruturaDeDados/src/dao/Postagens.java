package dao;

import java.util.Map;
import java.util.TreeMap;

public class Postagens {
    private static Postagens instance = new Postagens();
    private Map<String, String> post = new TreeMap<String, String>();
    
    public static Postagens getInstance(){
        return instance;
    }
    
    public void postar(String nome, String texto){
        post.put(nome, texto);
    }

    @Override
    public String toString() {
        return "Postagens{" + "post=" + post + '}';
    }
    
    public String print(){
        StringBuilder s = new StringBuilder();
        for(String p : post.values()){
            s.append(p);
            s.append("\n");
        }
        
        return s.toString();
    }
    
    public String printByName(String nome){
        
        String texto = post.get(nome);
        
        return texto;
    }
    
}
