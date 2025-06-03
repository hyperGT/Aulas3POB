package domain;

import util.PrecoInvalidoException;

public class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        try {
            validaPreco(preco);
            this.preco = preco;
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void validaPreco(double preco) throws PrecoInvalidoException{
        if(preco <= 0){
            throw new PrecoInvalidoException("O preço do produto não pode ser menor ou igual a zero.");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
