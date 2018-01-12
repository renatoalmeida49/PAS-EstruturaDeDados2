package modelo;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String sexo;
    private String email;
    private ArrayList<Pessoa> amigos;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String cpf, String sexo, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.amigos = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(){
        return "Nome: "+this.nome+"\nCPF: "+this.cpf+"\nSexo: "+this.sexo+"\nEmail: "+this.email+"\n";
    }
    
    public void adicionaAmigo(Pessoa amigo){
        Pessoa add = new Pessoa();
        add = amigo;
        this.amigos.add(add);
    }
    
        
}
