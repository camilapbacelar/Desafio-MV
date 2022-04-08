package br.com.desafiomv;

public class Pessoa {
    private String nome;
    private int cpf;
    private String comida;

    public Pessoa(String nome, int cpf, String comida) {
        this.nome = nome;
        this.cpf = cpf;
        this.comida = comida;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public String getComida() {
        return this.comida;
    }
}
