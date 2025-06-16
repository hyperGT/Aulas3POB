package controller;


public interface IGerenciaProdutos {

    void adicionarProduto(int id, String nome, int quantidade);
    Produto buscarProduto(int id);
    void listarProdutos();
    void atualizaProduto(int id, String novoNome, int novaQuantidade);
    void removerProduto(int id);
}