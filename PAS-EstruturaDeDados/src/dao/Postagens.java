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
}
