package dao;

import java.util.Map;
import java.util.TreeMap;
import modelo.Pessoa;

public class Usuarios {
    private static final Usuarios INSTANCE = new Usuarios();
    private Map<String, Pessoa> lista = new TreeMap<String, Pessoa>();
    
    public static Usuarios getInstance(){
        return INSTANCE;
    }
    
    public void add(Pessoa usuario){
        lista.put(usuario.getNome(), usuario);
        for(Pessoa p : lista.values()){
            System.out.println(p);
        }
    }
    
    public boolean busca(String nome){
        System.out.println(nome);
        Pessoa pessoaBuscada = lista.get(nome);
        System.out.println(pessoaBuscada);
        
        if(pessoaBuscada != null){
            return true;
        } else {
            return false;
        }
    }
    
    public void adicionar(String nome, String amigo){
        lista.get(nome).adicionaAmigo(lista.get(amigo));
        
    }
    
    
    public void print(){
        for(Pessoa p : lista.values()){
            System.out.println(p);
        }
    }
    
    
}
