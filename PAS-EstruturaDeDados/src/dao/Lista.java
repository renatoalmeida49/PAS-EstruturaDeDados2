package dao;

import java.util.Map;
import java.util.TreeMap;
import modelo.Pessoa;

public class Lista {
    private static Lista instance = new Lista();
    private Map<String, Pessoa> lista = new TreeMap<String, Pessoa>();
    
    public static Lista getInstance(){
        return instance;
    }
    
    public void add(Pessoa usuario){
        lista.put(usuario.getNome(), usuario);
    }
    
    public boolean busca(String nome){
        Pessoa pessoaBuscada = lista.get(nome);
        
        if(pessoaBuscada != null){
            return true;
        } else {
            return false;
        }
    }
    
    public void adicionar(String nome, String amigo){
        System.out.println("Bora? Adicionar?"+nome+amigo);
        Pessoa pessoaPAdd = lista.get(amigo);
        lista.get(nome).adicionaAmigo(pessoaPAdd);
        
    }
    
    
    public void print(){
        for(Pessoa p : lista.values()){
            System.out.println(p);
        }
    }
    
    
}
