package br.com.bruno.java.javaweb.web.model;

public class ItemPedido {
    private int     id;
    private int     Numero_pedido;
    private String  Produto;
    private double  Quantidade;
    private double  Valor;
    private double  Valor_total;

    public ItemPedido(int numero_pedido) {
        Numero_pedido = numero_pedido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getNumero_pedido() {
        return Numero_pedido;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double quantidade) {
        Quantidade = quantidade;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public double getValor_total() {
        return Valor_total;
    }

    public void setValor_total(double valor_total) {
        Valor_total = valor_total;
    }
}
