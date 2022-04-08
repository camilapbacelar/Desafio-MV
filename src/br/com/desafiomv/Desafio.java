package br.com.desafiomv;

import java.util.ArrayList;

public class Desafio {
    private ArrayList<Pessoa> listaPessoa;

    public Desafio() {
        this.listaPessoa = new ArrayList<Pessoa>();
    }
    public void adicionarPessoa(Pessoa p){
        this.listaPessoa.add(p);
    }
    public Pessoa selecionarPessoa(String nome){
       for (int i=0; i< this.listaPessoa.size(); i++) {
           Pessoa pessoa = this.listaPessoa.get(i);
           if (pessoa.getNome().equals(nome)){
               return pessoa;
           }
       }
       return null;
    }
    public void deletarPessoa(int cpf){
        for(int i=0; i< this.listaPessoa.size(); i++){
            Pessoa pessoa = this.listaPessoa.get(i);
            
            if (pessoa.getCpf()==cpf){ 
                this.listaPessoa.remove(i);
                break;
            }
        }
    }
}
